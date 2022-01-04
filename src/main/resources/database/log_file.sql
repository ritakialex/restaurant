CREATE TABLE tables_logs
(
    id           INT GENERATED ALWAYS AS IDENTITY,
    stamp        timestamp   NOT NULL DEFAULT now(),
    operation    varchar(20) NOT NULL,
    userid       varchar(20) NOT NULL,
    table_id     INT         NOT NULL,
    capacity     INT         NOT NULL,
    is_available BOOLEAN     NOT NULL

);

CREATE OR REPLACE FUNCTION tables_log_event()
    RETURNS TRIGGER AS
$$
BEGIN
    IF (TG_OP = 'DELETE') THEN
        INSERT INTO tables_logs(operation, userid, table_id, capacity, is_available)
        SELECT TG_OP, user, OLD.*;
        RETURN OLD;
    ELSE
        INSERT INTO tables_logs(operation, userid, table_id, capacity, is_available)
        SELECT TG_OP, user, NEW.*;
        RETURN NEW;
    END IF;
END;
$$
    LANGUAGE plpgsql;

CREATE TRIGGER log_event_tables
    AFTER INSERT OR UPDATE OR DELETE
    ON Tables
    FOR EACH ROW
EXECUTE PROCEDURE tables_log_event();

CREATE OR REPLACE FUNCTION get_tables_logs()
    RETURNS SETOF tables_logs AS
$$
BEGIN
    RETURN QUERY SELECT * FROM tables_logs;
END;
$$
    LANGUAGE plpgsql;

CREATE TABLE bookings_logs
(
    id             INT GENERATED ALWAYS AS IDENTITY,
    stamp          timestamp   NOT NULL DEFAULT now(),
    operation      varchar(20) NOT NULL,
    userid         varchar(20) NOT NULL,
    booking_id     INT         NOT NULL,
    table_id       INT         NOT NULL,
    date           DATE        NOT NULL,
    customer_name  VARCHAR     NOT NULL,
    customer_count INT         NOT NULL,
    hour           INT         NOT NULL

);

CREATE OR REPLACE FUNCTION bookings_log_event()
    RETURNS TRIGGER AS
$$
BEGIN
    IF (TG_OP = 'DELETE') THEN
        INSERT INTO bookings_logs(operation,
                                  userid,
                                  booking_id,
                                  table_id,
                                  date,
                                  customer_name,
                                  customer_count,
                                  hour)
        SELECT TG_OP, user, OLD.*;
        RETURN OLD;
    ELSE
        INSERT INTO bookings_logs(operation,
                                  userid,
                                  booking_id,
                                  table_id,
                                  date,
                                  customer_name,
                                  customer_count,
                                  hour)
        SELECT TG_OP, user, NEW.*;
        RETURN NEW;
    END IF;
END;
$$
    LANGUAGE plpgsql;

CREATE TRIGGER log_event_tables
    AFTER INSERT OR UPDATE OR DELETE
    ON Bookings
    FOR EACH ROW
EXECUTE PROCEDURE bookings_log_event();

CREATE OR REPLACE FUNCTION get_bookings_logs()
    RETURNS SETOF bookings_logs AS
$$
BEGIN
    RETURN QUERY SELECT * FROM bookings_logs;
END;
$$
    LANGUAGE plpgsql;

CREATE TABLE orders_logs
(
    id         INT GENERATED ALWAYS AS IDENTITY,
    stamp      timestamp   NOT NULL DEFAULT now(),
    operation  varchar(20) NOT NULL,
    userid     varchar(20) NOT NULL,
    order_id   INT         NOT NULL,
    table_id   INT         NOT NULL,
    booking_id INT,
    time       TIMESTAMP   NOT NULL

);

CREATE OR REPLACE FUNCTION orders_log_event()
    RETURNS TRIGGER AS
$$
BEGIN
    IF (TG_OP = 'DELETE') THEN
        INSERT INTO orders_logs(operation,
                                userid,
                                order_id,
                                table_id,
                                booking_id,
                                time)
        SELECT TG_OP, user, OLD.*;
        RETURN OLD;
    ELSE
        INSERT INTO orders_logs(operation,
                                userid,
                                order_id,
                                table_id,
                                booking_id,
                                time)
        SELECT TG_OP, user, NEW.*;
        RETURN NEW;
    END IF;
END;
$$
    LANGUAGE plpgsql;

CREATE TRIGGER log_event_tables
    AFTER INSERT OR UPDATE OR DELETE
    ON Orders
    FOR EACH ROW
EXECUTE PROCEDURE orders_log_event();

CREATE OR REPLACE FUNCTION get_orders_logs()
    RETURNS SETOF orders_logs AS
$$
BEGIN
    RETURN QUERY SELECT * FROM orders_logs;
END;
$$
    LANGUAGE plpgsql;

CREATE TABLE menu_items_logs
(
    id           INT GENERATED ALWAYS AS IDENTITY,
    stamp        timestamp     NOT NULL DEFAULT now(),
    operation    varchar(20)   NOT NULL,
    userid       varchar(20)   NOT NULL,
    menu_item_id INT           NOT NULL,
    name         VARCHAR       NOT NULL,
    description  VARCHAR       NOT NULL,
    category     FOOD_CATEGORY NOT NULL,
    price        REAL          NOT NULL,
    stock_number INT           NOT NULL

);

CREATE OR REPLACE FUNCTION menu_items_log_event()
    RETURNS TRIGGER AS
$$
BEGIN
    IF (TG_OP = 'DELETE') THEN
        INSERT INTO menu_items_logs(operation,
                                    userid,
                                    menu_item_id,
                                    name,
                                    description,
                                    category,
                                    price,
                                    stock_number)
        SELECT TG_OP, user, OLD.*;
        RETURN OLD;
    ELSE
        INSERT INTO menu_items_logs(operation,
                                    userid,
                                    menu_item_id,
                                    name,
                                    description,
                                    category,
                                    price,
                                    stock_number)
        SELECT TG_OP, user, NEW.*;
        RETURN NEW;
    END IF;
END;
$$
    LANGUAGE plpgsql;

CREATE TRIGGER log_event_tables
    AFTER INSERT OR UPDATE OR DELETE
    ON Menu_items
    FOR EACH ROW
EXECUTE PROCEDURE menu_items_log_event();

CREATE OR REPLACE FUNCTION get_menu_items_logs()
    RETURNS SETOF menu_items_logs AS
$$
BEGIN
    RETURN QUERY SELECT * FROM menu_items_logs;
END;
$$
    LANGUAGE plpgsql;



