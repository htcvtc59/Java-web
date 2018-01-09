create database ContactDBs
go
use ContactDBs
go
create table tblcontact
(
id int identity primary key,
username varchar(200),
gender varchar(100),
country varchar(100),
about varchar(200),
likes bit default 0
)