SELECT p.product_id, ifnull(ROUND(SUM(p.price * u.units) / sum(units),2),0) as average_price
FROM Prices p
LEFT JOIN UnitsSold u
ON p.product_id = u.product_id
AND u.purchase_date  BETWEEN p.start_date AND p.end_date
group by p.product_id;

