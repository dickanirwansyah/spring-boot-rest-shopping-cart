create table tabel_category(
    idcategory varchar(255) not null unique,
    name varchar(255) not null,
    description varchar(255) not null,

    constraint pk_category_idcategory PRIMARY KEY (idcategory)
);

create table tabel_product(
    idproduct varchar(255) not null unique,
    idcategory varchar(255) not null,
    name varchar(255) not null,
    description varchar(255) not null,
    quantity int not null,
    price int not null,
    created_date date not null,
    valid boolean null,

    constraint pk_product_idproduct PRIMARY KEY (idproduct),
    constraint fk_product_idcategory FOREIGN KEY (idcategory) REFERENCES
    tabel_category(idcategory)
);

insert into tabel_orders(orders_name, orders_address, orders_email, orders_phone,
tanggal_orders, amount) values ('dickanirwansyah', 'cilandak', 'dickanirwansyah@gmail.com',
'087885616532', '2018-04-01', 30000);

insert into tabel_orders_detil(idorders, idproduct, quantity, price, amount)
values (1, 'bc7e568d-cbdf-4a09-bfa4-3b0e9ea5126a', 1, 1000, 1000);

insert into tabel_orders_detil(idorders, idproduct, quantity, price, amount)
values (1, 'b493b860-e1da-4e45-afc4-18dd03c907a3a', 9, 1000, 9000);