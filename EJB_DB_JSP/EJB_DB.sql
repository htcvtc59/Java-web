create database EJBDB
go
use EJBDB
go
create table tblContact
(
id int primary key identity,
name nvarchar(200),
phone varchar(100),
gender varchar(100),
email varchar(200)
)