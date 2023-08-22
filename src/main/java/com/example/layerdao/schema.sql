create schema UsersTable;
create table UsersTable.CUSTOMERS
(
    id           int          not null auto_increment,
    name         varchar(255) not null,
    surname      varchar(255),
    age          int          not null,
    phone_number varchar(255) not null,
    primary key (id)
);

create table UsersTable.ORDERS
(
    id           int              not null auto_increment,
    date         date             not null,
    customer_id  int              not null,
    product_name varchar(255)     not null,
    amount       double precision not null,
    primary key (id),
    foreign key (customer_id) references UsersTable.CUSTOMERS (id)
);
