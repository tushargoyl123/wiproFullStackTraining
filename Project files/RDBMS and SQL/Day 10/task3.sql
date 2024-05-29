-- subquery to find customers with order above average order value
SELECT DISTINCT customers.customerId, customers.customerName, customers.email
FROM customers
JOIN orders ON customers.customerId = orders.customerId
where orders.totalAmount > (
	SELECT AVG(totalAmount)
    FROM orders
);

-- union query to combine 2 select statements
SELECT customerId, customerName, email, region
FROM (
	SELECT customerId, customerName, email, "EAST" AS region
    FROM customers 
    WHERE region = "EAST"
    UNION
    SELECT customerId, customerName, email, "WEST" AS region
    FROM customers 
    WHERE region = "WEST"
) AS combinedRegions;