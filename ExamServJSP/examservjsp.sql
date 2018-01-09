create database Phones
go
use Phones
go 
create table phone
(
id int identity primary key,
name varchar(200),
brand varchar(200),
price float,
description varchar(200)
)