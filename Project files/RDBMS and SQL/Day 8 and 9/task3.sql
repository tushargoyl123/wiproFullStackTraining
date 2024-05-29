-- create tables
create table accounts(
accountId int primary key,
balance decimal(10,2) not null
);

create table transactions(
transactionId int primary key auto_increment,
accountId int,
amount decimal(10,2),
transactionDate datetime,
foreign key (accountId) references accounts(accountId)
);

-- insert sample data
insert into accounts(accountId, balance) values(1,1000.00),(2,1500.0);

-- simulate a transaction
start transaction;
select balance from accounts where accountId=1 for update;
select balance from accounts where accountId=2 for update;
update accounts set balance = balance-200 where accountId=1;
update accounts set balance = balance+200 where accountId=2;
insert into transactions(accountId, amount, transactionDate) values(1,-200,now());
insert into transactions(accountId, amount, transactionDate) values(2,200,now());
commit;
select * from accounts;

-- demonstrate different isolation levels
-- read balance with different isolation levels
set session transaction isolation level read uncommitted;
start transaction;
select balance from accounts where accountId = 1;
commit;

set session transaction isolation level read committed;
start transaction;
select balance from accounts where accountId = 1;
commit;

set session transaction isolation level repeatable read;
start transaction;
select balance from accounts where accountId = 1;
commit;

set session transaction isolation level serializable;
start transaction;
select balance from accounts where accountId = 1;
commit;

-- update balance
start transaction;
update accounts set balance = balance+500 where accountId = 1;
insert into transactions(accountId, amount, transactionDate) values(1,500,now());
commit;

-- verification of transaction
select * from accounts;
select * from transactions;
