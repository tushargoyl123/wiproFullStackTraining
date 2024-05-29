use LibraryDb;
create index idx_isbn on books(ISBN);
explain select * from books where ISBN = "978-3-16-148410-0";
drop index idx_isbn on books;
explain select * from books where iSBN  = "978-3-16-148410-0"