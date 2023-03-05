# MTIT_Assigment1_InventorySystem

We developed a producer-consumer plugin project using eclipse Equinox OSGI Framework for an
inventory management system which is a private institute where students can learn music by enrolling in
a preferred course as per their wish. Admin can manage inventories, orders, invoices services as well as
cases. Customer can manage cases (view canceled cases, view case response, create new case, delete
case), search order by shipping date and view my invoices by order ID. Supplier can add new items and
view all items in inventory and supplier can create new orders and invoice according to the order ID.
Furthermore suppliers al so can create cases. Today transporters can view items to transport, return
invoices, approved invoices and create cases. Middle service publisher acts as a common interface for all
the publisher services. Altogether 4 consumer bundles and 4 publisher bundles were implemented to
cater to this scenario.
The 4 main clients/ consumers who will be using this system for multiple different purposes associated
with the academy are as follows:
 Administrator
 Customer
 Supplier
 Transporter
The services provided by the 4 publishers to all the above-mentioned consumers are as follows:
Administrator
 Add new item for inventory.
 View all inventory items.
 Create new order.
 View all available orders.
 Create new Invoice.
 View all invoices.
 View all cases.
Customer
 View Canceled cases.
 View case response
 Create new Case.
 Search order by shipping date
 View my invoice by order ID.
 Delete case by ID.
3
Supplier
 Add new item for inventory.
 View all inventory items.
 Create new order.
 Invoice according to the order ID
 Create new cases.
Transporter
 View today inventory Item to transport.
 View return invoices
 View approved invoices.
 Create new Case.
