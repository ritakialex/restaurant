## Notes

### Description
A system that manages the running stats in a given work day (eg. the orders, the tables, the bookings, the menu).

### Domain Entities

* **Menu Item**
  * Id
  * Name
  * Category
  * Description
  * Is_Available
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

