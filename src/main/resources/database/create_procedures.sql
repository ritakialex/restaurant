/*
    PROCEDURES:
        BOOKING:
            create(table_id, date, customer_name, customer_count): id
                if table is !available error else if customer_count < table_capacity insert else error
        ORDERS:
            create(table_id, menu_item_ids[]): id
                if table is available error else if menu_items are available insert else error
            get_price(menu_item_ids[]): price
                sum price of all menu items
        MENU_ITEM:
            create(name, description, price, stock_num): id
                creates menu item
*/
CREATE OR REPLACE PROCEDURE create_menu_item(m_name VARCHAR,
                                             m_description VARCHAR,
                                             m_price REAL,
                                             m_stock_number INT)
    LANGUAGE plpgsql
AS
$$
BEGIN
    INSERT INTO menu_items(name, description, price, stock_number)
    VALUES (m_name, m_description, m_price, m_stock_number);
END
$$;


CREATE OR REPLACE FUNCTION total_price(t_menu_item_ids INT[]) RETURNS REAL
    LANGUAGE plpgsql
AS
$$
DECLARE
    p_sum REAL := 0;
    m_id  INT;
BEGIN
    FOREACH m_id IN ARRAY t_menu_item_ids
        LOOP
            SELECT m.price + p_sum FROM Menu_items m WHERE id = m_id INTO p_sum;
        END LOOP;
    RETURN p_sum;
END
$$;



CREATE OR REPLACE PROCEDURE create_order(t_table_id INT, t_menu_item_ids INT[])
    LANGUAGE plpgsql
AS
$$
DECLARE
    t_is_available BOOLEAN;
    t_stock        INT;
    new_order_id   INT;
    m_id           INT;
BEGIN
    IF t_is_available THEN
        RAISE EXCEPTION 'Table is not occupied';
    ELSE
        INSERT INTO Orders(table_id) VALUES (t_table_id) RETURNING id INTO new_order_id;

        FOREACH m_id IN ARRAY t_menu_item_ids
            LOOP
                SELECT stock_number FROM Menu_items WHERE id = m_id INTO t_stock;

                IF NOT t_stock > 0 THEN
                    RAISE EXCEPTION 'Item is not in stock: %', m_id;
                ELSE
                    INSERT INTO Order_menu_item(order_id, menu_item_id) VALUES (new_order_id, m_id);
                END IF;
            END LOOP;
    END IF;
END
$$;



CREATE OR REPLACE PROCEDURE create_booking(t_table_id INT,
                                           t_date DATE,
                                           t_customer_name VARCHAR,
                                           t_customer_count INT)
    LANGUAGE plpgsql
AS
$$
DECLARE
    t_is_available BOOLEAN;
    t_capacity     INT;
BEGIN
    SELECT is_available, capacity
    FROM Tables
    WHERE id = t_table_id
    INTO t_is_available, t_capacity;

    IF NOT t_is_available THEN
        RAISE EXCEPTION 'Table is not available';
    ELSIF t_capacity < t_customer_count THEN
        RAISE EXCEPTION 'Table capacity is not sufficient';
    ELSE
        INSERT INTO Bookings(table_id, date, customer_name, customer_count)
        VALUES (t_table_id, t_date, t_customer_name, t_customer_count);
    END IF;
END
$$;