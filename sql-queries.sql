

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
insert into employee values(4, 'Karan',45000, 103, 'Mumbai');

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

alter table employee add(dept_id numeric(3),location varchar(100));

-- update to insert data for new columns
update  employee set dept_id=101 where id=1;
update  employee set dept_id=102 where id=2;
update  employee set dept_id=101 where id=3;
update  employee set dept_id=105 where id=4;

update employee set location="Bengaluru" where id in (1,3);
update employee set location="Delhi" where id in (2);
update employee set location="Mumbai" where id in (4);

-- create a new table dept with id, name, location 
create table dept (id numeric(3) primary key , name varchar(50), location varchar(100));
insert into dept values(101,'IT','Bangaluru');
insert into dept values(102,'Sales','Mumbai');
insert into dept values(103,'Accounts','Delhi');
insert into dept values(104,'HR','Bangaluru');

alter table dept modify id numeric(3);

-- add a foriegn key

alter table employee add foreign key(dept_id) references dept(id);

-- JOINS

-- INNER JOIN

select e.*,d.name as 'dept name' from employee e join dept d on e.dept_id=d.id where d.name='IT';

-- Outer Join
-- Left/Right/Full Join

select e.*,d.* from employee e left join dept d on e.dept_id=d.id;

-- find dept with no employee

SELECT d.id, d.name
FROM dept d
LEFT JOIN employee e
ON d.id = e.dept_id
WHERE e.id IS NULL;

-- find the max, min, avg salaries

select max(salary) as 'Highest Salary',min(salary) as 'Lowest Salary', avg(salary) as 'Average Salary' from employee; 

-- find highest paid employee


-- highest salary in each location

select location, max(salary) as 'Highest Salary' from employee group by location; 


 
