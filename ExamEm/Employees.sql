create database DBEmployees
go
use DBEmployees
go
create table Employees
(
id int identity primary key,
name nvarchar(200),
wage nvarchar(200)
)
