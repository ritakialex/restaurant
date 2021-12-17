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

CREATE TABLE ORDER_WITH_ITEMS
(
    id         INT,
    table_id   INT,
    booking_id INT,
    time       TIMESTAMP,
    items      INT[]
);

CREATE OR REPLACE FUNCTION get_order_with_items(t_order_id INT) RETURNS ORDER_WITH_ITEMS
    LANGUAGE plpgsql
AS
$$
DECLARE
    item_ids INT[];
    r_order ORDER_WITH_ITEMS;
BEGIN
    SELECT array_agg(id) FROM Order_menu_item o
    WHERE o.order_id = t_order_id INTO item_ids;

    SELECT *, item_ids FROM Orders o WHERE o.id = t_order_id INTO r_order;

    RETURN r_order;
END
$$;
