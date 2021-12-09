CREATE OR REPLACE PROCEDURE toggle_availability(table_id INT)
    LANGUAGE plpgsql
AS
$$
BEGIN
    UPDATE Tables SET is_available = NOT is_available WHERE id = table_id;
END;
$$;



CREATE OR REPLACE PROCEDURE create_menu_item(m_name VARCHAR,
                                             m_description VARCHAR,
                                             m_category FOOD_CATEGORY,
                                             m_price REAL,
                                             m_stock_number INT)
    LANGUAGE plpgsql
AS
$$
BEGIN
    INSERT INTO menu_items(name, description, category, price, stock_number)
    VALUES (m_name, m_description, m_category, m_price, m_stock_number);
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



CREATE OR REPLACE PROCEDURE create_order(t_table_id INT,
                                         t_menu_item_ids INT[],
                                         t_date DATE,
                                         t_hour INT)
    LANGUAGE plpgsql
AS
$$
DECLARE
    t_is_available BOOLEAN;
    t_stock        INT;
    new_order_id   INT;
    m_id           INT;
BEGIN


    SELECT is_available FROM Tables WHERE id = t_table_id INTO t_is_available;
    IF NOT t_is_available THEN
        RAISE EXCEPTION 'Table is not available';
    ELSE
        INSERT INTO Orders(table_id, date, hour)
        VALUES (t_table_id, t_date, t_hour)
        RETURNING id INTO new_order_id;
    END IF;


    FOREACH m_id IN ARRAY t_menu_item_ids
        LOOP
            SELECT stock_number FROM Menu_items WHERE id = m_id INTO t_stock;

            IF NOT t_stock > 0 THEN
                RAISE EXCEPTION 'Item is not in stock: %', m_id;
            ELSE
                INSERT INTO Order_menu_item(order_id, menu_item_id) VALUES (new_order_id, m_id);
            END IF;
        END LOOP;

END
$$;

CREATE OR REPLACE PROCEDURE create_order(t_table_id INT,
                                         t_menu_item_ids INT[],
                                         t_booking_id INT)
    LANGUAGE plpgsql
AS
$$
DECLARE
    t_stock          INT;
    new_order_id     INT;
    m_id             INT;
    booking_table_id INT;
    t_hour           INT;
    t_date           DATE;
BEGIN
    SELECT table_id, hour, date FROM Bookings WHERE id = t_booking_id
    INTO booking_table_id, t_hour, t_date;
    IF t_table_id = booking_table_id THEN
        INSERT INTO Orders(table_id, booking_id, date, hour)
        VALUES (t_table_id, t_booking_id, t_date, t_hour)
        RETURNING id INTO new_order_id;
    ELSE
        RAISE EXCEPTION 'Order table id/hour and booking table id/hour dont match';
    END IF;


    FOREACH m_id IN ARRAY t_menu_item_ids
        LOOP
            SELECT stock_number FROM Menu_items WHERE id = m_id INTO t_stock;

            IF NOT t_stock > 0 THEN
                RAISE EXCEPTION 'Item is not in stock: %', m_id;
            ELSE
                INSERT INTO Order_menu_item(order_id, menu_item_id) VALUES (new_order_id, m_id);
            END IF;
        END LOOP;

END
$$;



CREATE OR REPLACE PROCEDURE create_booking(t_table_id INT,
                                           t_date DATE,
                                           t_hour INT,
                                           t_customer_name VARCHAR,
                                           t_customer_count INT)
    LANGUAGE plpgsql
AS
$$
DECLARE

    t_capacity INT;
BEGIN
    SELECT capacity
    FROM Tables
    WHERE id = t_table_id
    INTO t_capacity;

    IF t_capacity < t_customer_count THEN
        RAISE EXCEPTION 'Table capacity is not sufficient';
    ELSE
        INSERT INTO Bookings(table_id, date, customer_name, customer_count, hour)
        VALUES (t_table_id, t_date, t_customer_name, t_customer_count, t_hour);
    END IF;
END
$$;