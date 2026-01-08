

create database ust_db;
use ust_db;

show tables;

-- DDL - create, alter, drop, truncate

create table employee(id numeric(5) primary key, name varchar(50), salary numeric(10,2));
show tables;

alter table employee add primary key(id);

drop table employee;


-- DML - insert, update, delete

insert into employee values(1, 'Harsh',56000);
insert into employee values(2, 'Javed',61000);
insert into employee values(3, 'Rohan',78000);
insert into employee values(4, 'Karan',45000);

update employee set salary=50000 where id=4;

delete from employee where id = 4;

-- DQL - select

select * from employee;

-- DCL - grant, revoke

-- Not required for Database users (Only for DBA)

-- TCL - commit, rollback, savepoint

set autocommit=false;
savepoint p1;
delete from employee where id = 4;
rollback to p1;
set autocommit=true;

-- where, order by, group by, joins

-- find employee by id


-- find employee by name


-- find employee in a range of salary


-- add new columns dept_id numeric(3) location varchar(100)
-- update to insert data for new columns

-- create a new table dept with id, name, location 
-- add some data (10, 'IT', 'Bengaluru')





