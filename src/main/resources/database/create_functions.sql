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
    RETURN ROUND(p_sum::NUMERIC,2);
END
$$;

CREATE OR REPLACE FUNCTION total_price_order(t_order_id INT) RETURNS REAL
    LANGUAGE plpgsql
AS
$$
DECLARE
    p_sum REAL;
BEGIN
    SELECT sum(price) FROM order_menu_item o
        INNER JOIN menu_items m on o.menu_item_id = m.id
    WHERE o.order_id = t_order_id INTO p_sum;

    RETURN ROUND(p_sum::NUMERIC,2);
END
$$;

CREATE TYPE ORDER_WITH_ITEMS AS
(
    id         INT,
    table_id   INT,
    booking_id INT,
    time       TIMESTAMP,
    items      INT[]
);

CREATE OR REPLACE FUNCTION get_order_with_items(t_order_id INT) RETURNS SETOF ORDER_WITH_ITEMS
    LANGUAGE plpgsql
AS
$$
DECLARE
    item_ids INT[];
BEGIN
    SELECT array_agg(id)
    FROM Order_menu_item o
    WHERE o.order_id = t_order_id
    INTO item_ids;

    RETURN QUERY SELECT *, item_ids FROM Orders o WHERE o.id = t_order_id;
END
$$;



CREATE OR REPLACE FUNCTION get_bookings(t_table_id INT,
                                        t_date DATE,
                                        t_customer_name VARCHAR,
                                        t_customer_count INT)
    RETURNS SETOF BOOKINGS
    LANGUAGE plpgsql
AS
$$
DECLARE
    where_q         VARCHAR := 'WHERE';
    and_q           VARCHAR := '';
    table_condition VARCHAR := '';
    date_condition  VARCHAR := '';
    name_condition  VARCHAR := '';
    count_condition VARCHAR := '';
BEGIN
    IF t_table_id IS NOT NULL THEN
        table_condition := format('%s %s table_id = %s', where_q, and_q, t_table_id);
        and_q := 'AND';
        where_q := '';
    END IF;
    IF t_date IS NOT NULL THEN
        date_condition := format('%s %s date = ''%s''::DATE', where_q, and_q, t_date);
        and_q := 'AND';
        where_q := '';
    END IF;
    IF t_customer_name IS NOT NULL THEN
        name_condition := format('%s %s customer_name = ''%s''', where_q, and_q, t_customer_name);
        and_q := 'AND';
        where_q := '';
    END IF;
    IF t_customer_count IS NOT NULL THEN
        count_condition := format('%s %s customer_count = %s', where_q, and_q, t_customer_count);
        and_q := 'AND';
        where_q := '';
    END IF;


    RETURN QUERY EXECUTE format('SELECT * FROM BOOKINGS %s %s %s %s',
                                table_condition,
                                date_condition,
                                name_condition,
                                count_condition);
END
$$;

CREATE OR REPLACE FUNCTION get_menu_items(t_food_category FOOD_CATEGORY,
                                          t_min_stock_number INT)
    RETURNS SETOF MENU_ITEMS
    LANGUAGE plpgsql
AS
$$
DECLARE
    where_q            VARCHAR := 'WHERE';
    and_q              VARCHAR := '';
    category_condition VARCHAR := '';
    stock_condition    VARCHAR := '';
BEGIN
    IF t_food_category IS NOT NULL THEN
        category_condition := format('%s %s category = ''%s''', where_q, and_q, t_food_category);
        and_q := 'AND';
        where_q := '';
    END IF;
    IF t_min_stock_number IS NOT NULL THEN
        stock_condition := format('%s %s stock_number >= %s', where_q, and_q, t_min_stock_number);
        and_q := 'AND';
        where_q := '';
    END IF;

    RETURN QUERY EXECUTE format('SELECT * FROM MENU_ITEMS %s %s',
                                category_condition,
                                stock_condition);
END
$$;

CREATE OR REPLACE FUNCTION get_tables(t_capacity INT,
                                      t_is_available BOOLEAN)
    RETURNS SETOF TABLES
    LANGUAGE plpgsql
AS
$$
DECLARE
    where_q             VARCHAR := 'WHERE';
    and_q               VARCHAR := '';
    capacity_condition  VARCHAR := '';
    available_condition VARCHAR := '';
BEGIN
    IF t_capacity IS NOT NULL THEN
        capacity_condition := format('%s %s capacity > %s', where_q, and_q, t_capacity);
        and_q := 'AND';
        where_q := '';
    END IF;
    IF t_is_available IS NOT NULL THEN
        available_condition :=
                format('%s %s is_available = ''%s''', where_q, and_q, t_is_available);
        and_q := 'AND';
        where_q := '';
    END IF;

    RETURN QUERY EXECUTE format('SELECT * FROM TABLES %s %s',
                                capacity_condition,
                                available_condition);
END
$$;