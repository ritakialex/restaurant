CREATE OR REPLACE FUNCTION set_unavailable() RETURNS TRIGGER
AS $$
DECLARE
BEGIN
    UPDATE Tables AS t
    SET is_available = false
    WHERE t.id = NEW.table_id;
    RETURN New;
END; $$
LANGUAGE plpgsql;

CREATE TRIGGER employee_delete_trigger AFTER INSERT
ON Orders FOR EACH ROW
EXECUTE PROCEDURE set_unavailable();