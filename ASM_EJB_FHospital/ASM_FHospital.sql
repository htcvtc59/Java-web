create database ejbDatabse
go
use ejbDatabse
go
create table tblAccount
(
	id int identity(1,1) primary key,
	name nvarchar(200),
	password varchar(200),
	role varchar(30),
	
)
go

create table tblDoctor
(
	id int identity(1,1) primary key,
	name nvarchar(200),
	specialist nvarchar(100)
)
go

create table tblExamination
(	
	id int identity(1,1) primary key,
	acc_id int ,
	doc_id int,
	a_date nvarchar(100),
	d_date nvarchar(100),
)

insert into tblAccount values ('admin','admin','admin')
go
insert into tblAccount values ('PatientA','PatientA','patient')
go
insert into tblAccount values ('PatientB','PatientB','patient')
go
select * from tblAccount
go
SELECT t.* FROM TblAccount t,TblExamination e WHERE e.a_date like '%16/12/2017%' and t.id = e.acc_id

insert into tblDoctor values('DoctorA','Than kinh')
go
insert into tblDoctor values('DoctorB','Da lieu')
go
select * from tblDoctor
insert into tblExamination values(1,1,'16/12/2017','16/12/2017')
go