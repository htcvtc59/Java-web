create database ASMAWAJS
go 
use ASMAWAJS
go
create table tblUser
(
	id int identity primary key,
	username varchar(50),
	password varchar(20),
	type varchar(10)
)
go

create table tblNews
(
	id int identity primary key,
	title nvarchar(1000),
	type nvarchar(100) ,
	subcontent ntext,
	content ntext,
	date varchar(30),
	image varchar(1000)
)
go

create table tblType
(
	id int identity primary key,
	type nvarchar(100)
)
