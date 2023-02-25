drop database if exists simple_task_manager;

create database simple_task_manager;

use simple_task_manager;

create table list (
	id int primary key auto_increment,
    user_name varchar(128) not null
);

create table list_item (
	id int primary key auto_increment,
    item_name varchar(128) not null,
    item_date date not null,
    item_complete bit not null default 0,
    item_deleted bit not null default 0,
    list_id int not null,
    constraint fk_list_item_list_id
        foreign key (list_id)
        references list(id)
);