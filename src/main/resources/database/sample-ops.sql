-- total_price(menu_item_ids INT[]) RETURNS REAL
SELECT * FROM total_price(array[1,2,3,4,5,6])

-- total_price_order(order_id INT) RETURNS REAL
SELECT * FROM total_price_order(1) 

-- get_order_with_items(order_id INT) RETURNS SETOF ORDER_WITH_ITEMS
SELECT * FROM get_order_with_items(1) 

-- FUNCTION get_bookings(table_id INT,
--                       date DATE,
--                       customer_name VARCHAR,
--                       customer_count INT) RETURNS SETOF BOOKINGS
SELECT * FROM get_bookings(NULL, NULL, NULL, NULL) 
SELECT * FROM get_bookings(NULL, NULL, 'John F. Kennedy', NULL) 

-- get_menu_items(food_category FOOD_CATEGORY,
--                min_stock_number INT) RETURNS SETOF MENU_ITEMS
SELECT * FROM get_menu_items(NULL, NULL)
SELECT * FROM get_menu_items('Appetizers', NULL) 

-- get_tables(capacity INT,
--            is_available BOOLEAN) RETURNS SETOF TABLES
SELECT * FROM get_tables(NULL, NULL) 
SELECT * FROM get_tables(5, 'true') 

-- toggle_availability(table_id INT)
call toggle_availability(1)

-- create_menu_item(name VARCHAR,
--                  description VARCHAR,
--                  category FOOD_CATEGORY,
--                  price REAL,
--                  stock_number INT)
call create_menu_item('name','a description','Appetizers',5.99,50)

-- create_order(table_id INT,
--              menu_item_ids INT[])

-- create_order(table_id INT,
--              menu_item_ids INT[],
--              booking_id INT)
call create_order(3, array[1,2,3,4])

-- create_booking(table_id INT,
--                date DATE,
--                hour INT,
--                customer_name VARCHAR,
--                customer_count INT)
call create_booking(1, '2022-1-13', 16, 'Slim Shady', 4)

-- delete_booking(booking_id INT)
call delete_booking(1)

-- update_menu_item_price(id INT, diff REAL)
call update_menu_item_price(1, -2.2)

-- update_menu_item_stock(id INT, diff INT)
call update_menu_item_stock(1, 10)

-- logging
SELECT * FROM get_tables_logs()
SELECT * FROM get_bookings_logs()
SELECT * FROM get_orders_logs()
SELECT id, stamp, operation, userid, name, price, category FROM get_menu_items_logs()




