create database Contactdb
go
use Contactdb
go
create table tblcontact
(
id int primary key identity,
name nvarchar(200),
age nvarchar(200),
address nvarchar(200)
)
select * from tblcontact

truncate table tblcontact
drop table tblcontact

delete from tblcontact where id=3
go
update tblcontact set title='Book2' where id=4
go

--store procedure

create procedure insertContact
@name varchar(200),
@age varchar(200),
@address varchar(200) 
as
begin
declare @count int
if @name is not null and @age is not null and @address is not null
begin 
insert into tblcontact(name,age,address) values(@name,@age,@address)
set @count = (select count(*) from tblcontact)
return @count
end
else
return -1
end

declare @i int = 0
while @i<50
begin
declare @n varchar(30)  = 'Anh'+CAST(@i as varchar)
declare @a varchar(30) = '20'+CAST(@i as varchar)
declare @d varchar(30)= 'HN'+CAST(@i as varchar)
exec insertContact  @n,@a,@d 
set @i = @i+1
end
go

create procedure viewDetail
@id int
as
begin
select * from tblcontact where id=@id
end

create procedure updateContact
@name varchar(200),
@age varchar(200),
@address varchar(200),
@id int
as
begin
if ((select count(*) from tblcontact where id=@id)<>1)
return -1
else
begin
update tblcontact 
set name=@name,age=@age,address=@address where id=@id
return 1
end
end

go

create procedure deleteContact
@id int
as
begin
if ((select count(*) from tblcontact where id=@id)<>1)
return -1
else
begin
delete from tblcontact where id=@id
return 1
end
end

create procedure searchContact
@name varchar(200),
@age varchar(200),
@address varchar(200)
as
begin
if @name is not null and @age is null and @address is null
select * from tblcontact where name like '%'+@name+'%'
else if @name is null and @age is not null and @address is null
select * from tblcontact where age like '%'+@age+'%'
else if @name is null and @age is null and @address is not null
select * from tblcontact where address like '%'+@address+'%'
else if @name is null and @age is null and @address is null
select * from tblcontact
end

--lay contact sau khi add

create procedure newContact
as
begin
select top(1) * from tblcontact order by id DESC
end


--phan trang 
create procedure customPage
@current_page bigint,
@limit bigint,
@name varchar(200),
@age varchar(200),
@address varchar(200)
as
begin
declare @total_record bigint
declare @total_page bigint
declare @start bigint 

if @name is not null and @age is null and @address is null
set @total_record = (select count(*) from tblcontact where name like '%'+@name+'%')
else if @name is null and @age is not null and @address is null
set @total_record = (select count(*) from tblcontact where age like '%'+@age+'%')
else if @name is null and @age is null and @address is not null
set @total_record = (select count(*) from tblcontact where address like '%'+@address+'%')
else if @name is null and @age is null and @address is null
set @total_record = (select count(*) from tblcontact)

--set @total_record = (select count(*) from tblcontact)

set @total_page = CEILING(CAST(@total_record as decimal)/CAST(@limit as decimal))

if @current_page>@total_page
begin
set @current_page = @total_page 
end
else if @current_page<1
begin 
set @current_page = 1
end

set @start = (@current_page-1)*@limit

if @name is not null and @age is null and @address is null
begin 
;WITH Numberedtblcontact AS
(
    SELECT
	    *,
        ROW_NUMBER() OVER (ORDER BY id) AS RowNumber
    FROM
        tblcontact where name like '%'+@name+'%'
)select top(@limit)* from Numberedtblcontact where  RowNumber BETWEEN  @start and @start+@limit
end

else if @name is null and @age is not null and @address is null
begin 
;WITH Numberedtblcontact AS
(
    SELECT
	    *,
        ROW_NUMBER() OVER (ORDER BY id) AS RowNumber
    FROM
        tblcontact where age like '%'+@age+'%'
)select top(@limit)* from Numberedtblcontact where  RowNumber BETWEEN  @start and @start+@limit
end
else if @name is null and @age is null and @address is not null
begin 
;WITH Numberedtblcontact AS
(
    SELECT
	    *,
        ROW_NUMBER() OVER (ORDER BY id) AS RowNumber
    FROM
        tblcontact where address like '%'+@address+'%'
)select top(@limit)* from Numberedtblcontact where  RowNumber BETWEEN  @start and @start+@limit
end
else if @name is null and @age is null and @address is null
begin 
;WITH Numberedtblcontact AS
(
    SELECT
	    *,
        ROW_NUMBER() OVER (ORDER BY id) AS RowNumber
    FROM
        tblcontact 
)select top(@limit)* from Numberedtblcontact where  RowNumber BETWEEN  @start and @start+@limit
end

return @total_page
end




CREATE FUNCTION [dbo].[fuConvertToUnsign1] 
( @strInput NVARCHAR(4000) )
 RETURNS NVARCHAR(4000) 
 AS BEGIN IF @strInput IS NULL 
 RETURN @strInput IF @strInput = '' RETURN @strInput 
 DECLARE @RT NVARCHAR(4000) 
 DECLARE @SIGN_CHARS NCHAR(136) 
 DECLARE @UNSIGN_CHARS NCHAR (136)
  SET @SIGN_CHARS = N'ăâđêôơưàảãạáằẳẵặắầẩẫậấèẻẽẹéềểễệế ìỉĩịíòỏõọóồổỗộốờởỡợớùủũụúừửữựứỳỷỹỵý ĂÂĐÊÔƠƯÀẢÃẠÁẰẲẴẶẮẦẨẪẬẤÈẺẼẸÉỀỂỄỆẾÌỈĨỊÍ ÒỎÕỌÓỒỔỖỘỐỜỞỠỢỚÙỦŨỤÚỪỬỮỰỨỲỶỸỴÝ' +NCHAR(272)+ NCHAR(208) 
  SET @UNSIGN_CHARS = N'aadeoouaaaaaaaaaaaaaaaeeeeeeeeee iiiiiooooooooooooooouuuuuuuuuuyyyyy AADEOOUAAAAAAAAAAAAAAAEEEEEEEEEEIIIII OOOOOOOOOOOOOOOUUUUUUUUUUYYYYYDD' 
  DECLARE @COUNTER int 
  DECLARE @COUNTER1 int 
  SET @COUNTER = 1 WHILE (@COUNTER <=LEN(@strInput))
   BEGIN SET @COUNTER1 = 1 WHILE (@COUNTER1 <=LEN(@SIGN_CHARS)+1) 
   BEGIN IF UNICODE(SUBSTRING(@SIGN_CHARS, @COUNTER1,1)) = UNICODE(SUBSTRING(@strInput,@COUNTER ,1) )
    BEGIN IF @COUNTER=1 SET @strInput = SUBSTRING(@UNSIGN_CHARS, @COUNTER1,1) + SUBSTRING(@strInput, @COUNTER+1,LEN(@strInput)-1)
	 ELSE SET @strInput = SUBSTRING(@strInput, 1, @COUNTER-1) +SUBSTRING(@UNSIGN_CHARS, @COUNTER1,1) + SUBSTRING(@strInput, @COUNTER+1,LEN(@strInput)- @COUNTER) 
	 BREAK END SET @COUNTER1 = @COUNTER1 +1 END SET @COUNTER = @COUNTER +1 END SET @strInput = replace(@strInput,' ','-') RETURN @strInput END
	 
	 go
select dbo.fuConvertToUnsign1('Anh yêu em')



