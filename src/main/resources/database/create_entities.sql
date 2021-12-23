CREATE TABLE Tables
(
    id           INT     GENERATED ALWAYS AS IDENTITY,
    capacity     INT     NOT NULL, -- Filter -> Rita
    is_available BOOLEAN NOT NULL, -- Filter -> Rita -- Update (Toggle)
    PRIMARY KEY(id)
);


CREATE TABLE Bookings -- Insert/Delete
(
    id             INT     GENERATED ALWAYS AS IDENTITY,
    table_id       INT     NOT NULL, -- Filter
    date           DATE    NOT NULL, -- Filter
    customer_name  VARCHAR NOT NULL, -- Filter
    customer_count INT     NOT NULL, -- Filter
    hour           INT     NOT NULL
        CHECK (hour >= 8 AND hour <= 22),
    PRIMARY KEY(id),
    FOREIGN KEY(table_id)
      REFERENCES Tables(id),
    UNIQUE (date, hour, table_id)
);

CREATE TABLE Orders 
(
    id            INT  GENERATED ALWAYS AS IDENTITY,
    table_id      INT  NOT NULL,
    booking_id    INT,
    time          TIMESTAMP,
    PRIMARY KEY(id),
    FOREIGN KEY(table_id)
      REFERENCES Tables(id),
    FOREIGN KEY (booking_id)
      REFERENCES Bookings(id)
);

CREATE TYPE FOOD_CATEGORY
    AS ENUM ('Appetizers', 'Salads', 'Main Dishes', 'Drinks', 'Alcoholic Drinks');

CREATE TABLE Menu_items -- Insert
(
    id           INT           GENERATED ALWAYS AS IDENTITY,
    name         VARCHAR       NOT NULL UNIQUE,
    description  VARCHAR       NOT NULL,
    category     FOOD_CATEGORY NOT NULL, -- Filter
    price        REAL          NOT NULL, -- Update (reduce / increase)
    stock_number INT           NOT NULL, -- Filter -- Update (reduce / increase)
    PRIMARY KEY(id)
);


CREATE TABLE Order_menu_item
(
  id           INT GENERATED ALWAYS AS IDENTITY,
  order_id     INT NOT NULL,
  menu_item_id INT NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY(order_id)
      REFERENCES Tables(id),
  FOREIGN KEY(menu_item_id)
      REFERENCES Menu_items(id)
)