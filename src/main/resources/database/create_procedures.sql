/*
PLANNING:
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


CREATE OR REPLACE PROCEDURE create_booking(t_table_id INT,
                                           t_date DATE,
                                           t_customer_name VARCHAR,
                                           t_customer_count INT)
LANGUAGE plpgsql
AS $$
DECLARE
    t_is_available BOOLEAN;
    t_capacity INT;
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

END $$;