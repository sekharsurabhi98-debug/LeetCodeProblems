SELECT p.product_id, ifnull(t.price,10) as price
FROM Products p
LEFT JOIN (
SELECT product_id, new_price as price
FROM Products
WHERE (product_id, change_date) in (
SELECT product_id, max(change_date) as change_date
FROM Products
WHERE change_date <= '2019-08-16'
GROUP BY product_id)) t
ON p.product_id = t.product_id
GROUP BY p.product_id