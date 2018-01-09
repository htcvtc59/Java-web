create database shopDB
go
use shopDB
go
create table tblproduct
(
id int identity primary key,
name nvarchar(200),
price float,
quantity int
)
