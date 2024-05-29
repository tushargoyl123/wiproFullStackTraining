create database LibraryDB;
use LibraryDB;
create table authors(
authorId int primary key auto_increment,
firstName varchar(50) not null,
lastName varchar(50) not null,
birthDate date not null,
check (birthDate<="2024-05-01")
);

-- table for books
create table books(
bookId int primary key auto_increment,
title varchar(255) not null,
authorId int,
ISBN varchar(13) not null,
publishYear int check(publishYear>=1440 AND publishYear<2024),
genre varchar(50),
copiesAvailable int not null check (copiesAvailable>=0),
foreign key (authorId) references authors(authorId)
);

-- table for members
create table members(
memberId int primary key auto_increment,
firstName varchar(50) not null,
lastName varchar(50) not null,
email varchar(100) unique not null,
phone varchar(15) not null,
joinDate date not null,
check (joinDate<="2024-01-01")
);

-- table for loans
create table loans(
loadId int primary key auto_increment,
bookId int not null,
memberId int not null,
loanDate date not null,
returnDate date,
dueDate date not null,
foreign key (bookId) references books(bookId),
foreign key (memberId) references members(memberId),
check (returnDate is null or returnDate>=loanDate)
);

alter table books add column publisher varchar(100);
alter table members modify column phone varchar(20) not null;
create table categories(
categoryId int primary key not null,
categoryName varchar(50) not null
);
drop table categories;

