-- retrieve everything from customers table
SELECT * from customers;

-- modification to retrieve only customer name and email from specific city say Bengaluru
SELECT customerName, email
FROM customers
WHERE city = "Bengaluru";
