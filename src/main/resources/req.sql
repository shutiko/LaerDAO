select product_name
from UsersTable.ORDERS
         join UsersTable.CUSTOMERS C on C.id = UsersTable.ORDERS.customer_id
where name = :name;