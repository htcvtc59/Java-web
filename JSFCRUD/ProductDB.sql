create database Productdb
go
use Productdb
go
create table tblproduct
(
id int identity primary key,
name varchar(100),
price float
)
select * from tblproduct
insert into tblproduct values('232','3232')