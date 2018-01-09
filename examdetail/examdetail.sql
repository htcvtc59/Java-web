create database DBExamDetail
go
use DBExamDetail
go
create table tblExam
(
examcode varchar(100) primary key,
date varchar(200),
duration varchar(200),
faculty varchar(200),
subject varchar(200)
)
select * from tblExam