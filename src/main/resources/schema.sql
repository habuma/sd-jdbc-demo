drop table if exists Book;

create table Book (
 
  id identity,
  isbn varchar(10) not null,
  title varchar(100) not null,
  author varchar(100) not null,
  created_by varchar(100),
  created_date timestamp,
  updated_by varchar(100),
  updated_date timestamp

);