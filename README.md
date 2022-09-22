## Notes

### Description
A project in Java, using a PostgreSQL database.
A system that manages the running stats in a given work day (eg. the orders, the tables, the bookings, the menu), the end user is the restaurant's staff members.

### Domain Entities

* **Menu Item**
  * Id
  * Name
  * Category
  * Description
  * Stock_num 
  * *(Orders per 100 customers)*

* **Tables**
  * Id
  * Capacity
  * Status (whether a table is available)

* **Booking**
  * Id
  * Booking_name
  * Table (Fk)
  * Date
  * Order

* **Order_to_Menu_item**
  * Order_id
  * Menu_item_id

* **Order**
  * Id

### Functional Requirements

##### Booking
* An employee needs to note the date, the table, the customer's name. The system needs to inform the employee on the availability status of the table.
* When a booking is made, the table needs to be marked as unavailable
* Initially a list with all items is displayed. When an item is pressed, the full details are shown

##### Orders
* An employee notes the table, the menu items and the price is automatically computed. The order needs to coorespond with an occupied table and all items need to be available.
* The stock number of the menu items are decreased according to the order.
* Initially a list with all items is displayed. When an item is pressed, the full details are shown

##### Menu Items
* An employee needs to see the name, description, price, availability of the all menu items.
* Employees can add a menu item by providing the necessary info
* Initially a list with all items is displayed. When an item is pressed, the full details are shown

##### Tables
* An employee sees the availability, and capacity of tables.
* A table is declared unavailable either manually or in response to a booking. It can be declared available again manually
* Initially a list with all items is displayed. When an item is pressed, the full details are shown
