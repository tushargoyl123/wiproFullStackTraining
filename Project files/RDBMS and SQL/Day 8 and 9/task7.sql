set sql_safe_updates = 0;

use LibraryDB;
insert into authors(firstName,lastName,birthDate)
values("fName1","lName1","1970-05-15"),
	  ("fName1","lName1","1970-05-15");
insert into books(title,authorId,ISBN,publishYear,genre,copiesAvailable)
values("book1",1,"978-3-1148-0","2010","Fiction",5),
	  ("book2",2,"978-0-1410-0","2010","Science",7);
      
insert into members(firstName,lastName,email,phone,joinDate)
values("fName1","lName1","fName12@someone.com",11223344,"2022-01-15"),
	  ("fName2","lName2","fName22@someone.com",11234444,"2021-01-15");


insert into loans(bookId,memberId,loanDate,dueDate)
values(1,1,"2024-04-01","2024-04-15"),
	  (2,2,"2024-04-05","2024-04-19");

update books set copiesAvailable = 10 where ISBN = "978-3-16-148410-0,2010";
update members set phone = "1234222" where email = "fName12@someone.com";
delete from loans where duedate<curdate() - interval 30 day;

load data infile "C:\Users\Administrator\Desktop\SQL\Day 8 and 9\books.csv"
into table books
fields terminated by "," enclosed by '"'
lines terminated by "\n"
(title,authorId,ISBN,publishYear,genre,copiesAvailable)
