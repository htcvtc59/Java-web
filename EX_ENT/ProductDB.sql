create database ProductDB
go
use ProductDB
go
create table Product
(
proId int primary key,
prodName varchar(200),
prodPrice float,
prodQuantity int
)