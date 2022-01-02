CREATE OR REPLACE FUNCTION set_unavailable() RETURNS TRIGGER
AS
$$
DECLARE
BEGIN
    UPDATE Tables AS t
    SET is_available = false
    WHERE t.id = NEW.table_id;
    RETURN New;
END;
$$
    LANGUAGE plpgsql;

CREATE TRIGGER set_unavailable_orders_trigger
    AFTER INSERT
    ON Orders
    FOR EACH ROW
EXECUTE PROCEDURE set_unavailable();

CREATE OR REPLACE FUNCTION decrement_stock() RETURNS TRIGGER
AS
$$
DECLARE
BEGIN
    UPDATE Menu_items AS m
    SET stock_number = stock_number - 1
    WHERE m.id = NEW.menu_item_id;
    RETURN New;
END;
$$
    LANGUAGE plpgsql;

CREATE TRIGGER decrement_stock_menu_items_trigger
    AFTER INSERT
    ON Order_menu_item
    FOR EACH ROW
EXECUTE PROCEDURE decrement_stock();
