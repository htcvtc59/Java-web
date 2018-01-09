create database ProductJSFdb
go 
use ProductJSFdb
go
create table tblproduct
(
id int identity primary key ,
name nvarchar(200),
price float
)

select top(10)* from tblproduct where id between 15 and 15+10
select * from tblproduct

declare @i int = 1
while(@i<50)
begin
insert into tblproduct values(@i,@i)
set @i = @i+1
end
