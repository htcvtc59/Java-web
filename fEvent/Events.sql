create database EventsDB
go
use EventsDB
go
create table tblEvent
(
id int identity primary key,
dateevent varchar(200),
timeevent varchar(200),
planning varchar(200),
whereevent varchar(200),
moreinfo varchar(200)
)

