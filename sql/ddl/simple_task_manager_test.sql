drop database if exists simple_task_manager_test;

create database simple_task_manager_test;

use simple_task_manager_test;

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

delimiter //
create procedure set_known_good_state()
begin

	delete from list;
    alter table list auto_increment = 1;
    delete from list_item;
    alter table list_item auto_increment = 1;
    
    insert into list(id, user_name) values
        (1, 'me@test.co'),
        (2, 'you@oddtest.co'),
        (3, 'another@moretest.co');
        
	insert into list_item (id, item_name, item_date, item_complete, item_deleted, list_id)
		values
	(1, 'Task 1', '2022-09-16', 1, 0, 1),
    (2,  'Task 2', '2022-09-16', 1, 0, 1),
    (3, 'Task 3', '2022-09-16', 1, 0, 2),
	(4, 'Task 4', '2022-09-16', 1, 0, 1),
	(5, 'Task 5', '2022-09-16', 1, 0, 3),
	(6, 'Task 6', '2022-09-16', 1, 0, 1);

end //
-- 4. Change the statement terminator back to the original.
delimiter ;
