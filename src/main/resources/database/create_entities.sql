CREATE TABLE Bookings
(
    id             INT     GENERATED ALWAYS AS IDENTITY,
    table_id       INT     NOT NULL,
    date           DATE    NOT NULL,
    customer_name  VARCHAR NOT NULL,
    customer_count INT     NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY(table_id)
      REFERENCES Tables(id)
);

CREATE TABLE Orders 
(
    id            INT GENERATED ALWAYS AS IDENTITY,
    table_id      INT NOT NULL, 
    PRIMARY KEY(id),
    FOREIGN KEY(table_id)
      REFERENCES Tables(id)
);

CREATE TABLE Menu_items 
(
    id           INT     GENERATED ALWAYS AS IDENTITY,
    name         VARCHAR NOT NULL UNIQUE,
    description  VARCHAR NOT NULL,
    price        REAL    NOT NULL,
    stock_number INT     NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE Tables
(
    id           INT     GENERATED ALWAYS AS IDENTITY,
    capacity     INT     NOT NULL,
    is_available BOOLEAN NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE Order_menu_item
(
  order_id     INT NOT NULL,
  menu_item_id INT NOT NULL,
  PRIMARY KEY (order_id, menu_item_id),
  FOREIGN KEY(order_id)
      REFERENCES Tables(id),
  FOREIGN KEY(menu_item_id)
      REFERENCES Menu_items(id)
)

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
    TRIGGERS:
        BOOKING:
            ON CREATE SET REFERENCED TABLE UNAVAILABLE
        ORDER:
            ON CREATE DECREASE ALL STOCK NUMS OF REFERENCED MENU ITEMS
*/