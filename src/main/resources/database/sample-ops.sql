-- #Orders --
SELECT total_price_order(1) --------------- total_price_order(order_id INT) 
                            --------------- RETURNS REAL

call create_order(2, array[1,3,4]) -------- create_order(table_id INT,
                                   --------              menu_item_ids INT[],
                                   --------              booking_id INT)
                                   --------
                                   -------- create_order(table_id INT,
                                   --------              menu_item_ids INT[])
                                   --------
                                   -------- triggers set_unavailable() ON Tables
                                   -------- sets talbe of order to unavailable
                                   --------
                                   -------- triggers decrement_stock() ON Menu_items
                                   -------- decrements the stock number of each
                                   -------- associated menu item


SELECT * FROM get_order_with_items(NULL) -- get_order_with_items(order_id INT) 
                                         -- RETURNS SETOF ORDER_WITH_ITEMS

SELECT * FROM get_orders_logs() ----------- get_orders_logs() 
                                ----------- RETURNS SETOF ORDERS_LOGS 

-- #Bookings --
SELECT * FROM get_bookings(NULL, NULL, NULL, NULL) -- FUNCTION get_bookings(table_id INT,
                                                   --                       date DATE,
                                                   --                       customer_name VARCHAR,
                                                   --                       customer_count INT) 
                                                   -- RETURNS SETOF BOOKINGS

call create_booking(1, 'yyyy-mm-dd', 1, '', 1) ------ create_booking(table_id INT,
                                               ------                date DATE,
                                               ------                hour INT,
                                               ------                customer_name VARCHAR,
                                               ------                customer_count INT)

SELECT * FROM get_bookings_logs() ------------------- get_bookings_logs() 
                                  ------------------- RETURNS SETOF BOOKINGS_LOGS 
            
call delete_booking(1) ------------------------------ delete_booking(booking_id INT)


-- #Menu_items --
SELECT total_price(array[1,2,3,4,5,6])   -- total_price(menu_item_ids INT[]) 
                                         -- RETURNS REAL

SELECT * FROM get_menu_items(NULL, NULL) -- get_menu_items(food_category FOOD_CATEGORY,
                                         --                min_stock_number INT) 
                                         -- RETURNS SETOF MENU_ITEMS

SELECT id, name, description, category, price, stock_number as stock FROM get_menu_items(NULL, 10) 
                                         
call create_menu_item('', '', '', 1, 1) --- create_menu_item(name VARCHAR,
                                        ---                  description VARCHAR,
                                        ---                  category FOOD_CATEGORY,
                                        ---                  price REAL,
                                        ---                  stock_number INT)

call update_menu_item_price(4, 1.25) ------ update_menu_item_price(id INT, diff REAL)

call update_menu_item_stock(4, -10)  ------ update_menu_item_price(id INT, diff REAL)

SELECT name, menu_item_id, operation, price, stock_number  FROM get_menu_items_logs() 
                                     ------- get_bookings_logs() 
                                     ------- RETURNS SETOF BOOKINGS_LOGS

-- #Tables --
SELECT * FROM get_tables(NULL, NULL) -- get_tables(capacity INT,
                                     --            is_available BOOLEAN) 
                                     -- RETURNS SETOF TABLES

call toggle_availability(1) ----------- toggle_availability(table_id INT)

SELECT * FROM get_tables_logs() ------- get_tables_logs()
                                ------- RETURNS SETOF TABLES_LOGS




