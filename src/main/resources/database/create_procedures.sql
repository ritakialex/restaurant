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

CREATE OR REPLACE PROCEDURE create_order(t_table_id INT,
                                         t_menu_item_ids INT[])
    LANGUAGE plpgsql
AS
$$
DECLARE
    t_is_available BOOLEAN;
    t_stock        INT;
    new_order_id   INT;
    m_id           INT;
    t_current_time TIMESTAMP;
BEGIN
    SET TIMEZONE = 'Europe/Athens';
    SELECT NOW() INTO t_current_time;

    SELECT is_available FROM Tables WHERE id = t_table_id INTO t_is_available;
    IF NOT t_is_available THEN
        RAISE EXCEPTION 'Table is not available';
    ELSE
        INSERT INTO Orders(table_id, time)
        VALUES (t_table_id, t_current_time)
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
    t_current_time   TIMESTAMP;
    t_is_available   BOOLEAN;
BEGIN
    SET TIMEZONE = 'Europe/Athens';
    SELECT NOW() INTO t_current_time;

    SELECT table_id, hour, date
    FROM Bookings
    WHERE id = t_booking_id
    INTO booking_table_id, t_hour, t_date;

    SELECT is_available FROM Tables WHERE id = t_table_id INTO t_is_available;

    IF NOT DATE(t_current_time) = t_date OR NOT extract(hour from t_current_time) = t_hour THEN
        RAISE EXCEPTION 'Customers havent arrived yet';
    ELSIF NOT t_table_id = booking_table_id THEN
        RAISE EXCEPTION 'Order table id and booking table id dont match';
    ELSIF NOT t_is_available THEN
        RAISE EXCEPTION 'Table is not available';
    ELSE
        INSERT INTO Orders(table_id, booking_id, time)
        VALUES (t_table_id, t_booking_id, t_current_time)
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

CREATE OR REPLACE PROCEDURE delete_booking(t_booking_id INT)
    LANGUAGE plpgsql
AS
$$
BEGIN
    DELETE
    FROM BOOKINGS
    WHERE id = t_booking_id;
END
$$;

CREATE OR REPLACE PROCEDURE update_menu_item_price(m_id INT, diff REAL)
    LANGUAGE plpgsql
AS
$$
BEGIN
    UPDATE MENU_ITEMS
    SET price = ROUND((price + diff)::numeric, 2)
    WHERE id = m_id;
END
$$;

CREATE OR REPLACE PROCEDURE update_menu_item_stock(m_id INT, diff INT)
    LANGUAGE plpgsql
AS
$$
BEGIN
    UPDATE MENU_ITEMS
    SET stock_number = stock_number + diff
    WHERE id = m_id;
END
$$;