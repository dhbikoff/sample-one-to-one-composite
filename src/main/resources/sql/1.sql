create table bar(
    bar_id int not null auto_increment,
    name varchar(64) not null,
    address varchar(64) not null,
    primary key (name, address),
    key bar_id (bar_id)
);

create table baz(
    name varchar(64) not null,
    address varchar(64) not null,
    primary key (name, address)
);

insert into bar (name, address) values ('name1', 'address1'), ('name2', 'address2');
insert into baz (name, address) values ('name1', 'address1'), ('name2', 'address2');
