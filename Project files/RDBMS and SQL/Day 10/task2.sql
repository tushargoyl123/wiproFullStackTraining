-- INNER JOIN
SELECT customers.customerId, customers.customorName, customers.email,orders.orderId, orders.orderDate,orders.totalAmount
FROM customers
INNER JOIN orders ON customers.customerId = orders.orderId
WHERE customers.region = "EAST";

-- LEFT JOIN
SELECT customers.customerId, customers.customorName, customers.email,orders.orderId, orders.orderDate,orders.totalAmount
FROM customers
LEFT JOIN orders ON customers.customerId = orders.orderId