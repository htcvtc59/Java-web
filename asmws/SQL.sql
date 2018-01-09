create database bookdbs
go
use bookdbs
go
create table books
(
id int identity primary key,
name nvarchar(200),
price float,
description nvarchar(200),
image nvarchar(200)
)
insert into books values(N'name1',1000,'des1','image1')
select * from books
