create database BooksDB
go
use BooksDB
go
create table tblbook
(
id int primary key identity,
title nvarchar(200),
description nvarchar(200),
author nvarchar(200),
price float ,
image nvarchar(200)
)
select * from tblbook

truncate table tblbook

delete from tblbook where id=3

update tblbook set title='Book2' where id=4


