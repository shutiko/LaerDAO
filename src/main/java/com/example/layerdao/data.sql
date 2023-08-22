insert into UsersTable.CUSTOMERS (name, surname, age, phone_number)
values ('Ivan', 'Ivanov', 25, 89254774535),
       ('alexey', 'Petrov', 43, 89154565568),
       ('Petr', 'Menshov', 21, 89154544568),
       ('Alexey', 'Lidov', 33, 89189565568),
       ('Evgeny', 'Muhin', 28, 89185465568);


insert into UsersTable.ORDERS (date, customer_id, product_name, amount)
values ('2023-08-11', 1, 'Гамбургер с котлетой', 100),
       ('2023-08-11', 3, 'Гамбургер с курицей', 90),
       ('2023-08-11', 5, 'Наггетсы', 70),
       ('2023-08-11', 4, 'Кола', 40),
       ('2023-08-11', 2, 'Спрайт', 40)