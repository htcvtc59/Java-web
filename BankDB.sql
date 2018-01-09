create database bankdb
go
use bankdb
go
create table tblAccount
(
cusNo varchar(15) primary key,
cusName varchar(30),
passcode varchar(30),
balance float,
)
go
insert into tblAccount values('cus01','TruongLX','passcode1',20000)
insert into tblAccount values('cus02','CuongLX','passcode2',20000)
insert into tblAccount values('cus03','XuongLX','passcode3',20000)

update tblAccount set balance=1000 where cusNo='cus01'
select * from tblAccount where passcode='passcode1'
