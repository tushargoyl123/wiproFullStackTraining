create user "library_user"@"localhost" identified by "securepassword";
grant select, insert, update, delete on LibraryDB.* to "library_user"@"localhost";
flush privileges;
show grants for "library_user"@"localhost";
revoke delete on LibraryDB.* from "library_user"@"localhost";
flush privileges;
show grants for "library_user"@"localhost";
drop user "library_user"@"localhost";