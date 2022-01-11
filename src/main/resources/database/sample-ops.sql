SELECT * FROM BOOKINGS;

SELECT * FROM total_price(array[1,2,3,4,5,6])

SELECT * FROM total_price_order(1) 

SELECT * FROM get_order_with_items(1) 

SELECT * FROM get_bookings(NULL, NULL, NULL, NULL) 
SELECT * FROM get_bookings(NULL, NULL, 'John F. Kennedy', NULL) 

SELECT * FROM get_menu_items(NULL, NULL)
SELECT * FROM get_menu_items('Appetizers', NULL) 

SELECT * FROM get_tables(NULL, NULL) 
SELECT * FROM get_tables(NULL, 'true') 

call toggle_availability(1)

