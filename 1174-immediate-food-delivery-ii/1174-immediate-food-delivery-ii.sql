SELECT 
    ROUND(SUM(CASE WHEN t1.order_date = t2.early_date THEN 1 ELSE 0 END) /
    COUNT(*) * 100,2) AS immediate_percentage
FROM
(
    SELECT customer_id, MIN(order_date) AS order_date
    FROM Delivery
    GROUP BY customer_id
) t1
JOIN 
(
    SELECT customer_id, MIN(customer_pref_delivery_date) AS early_date
    FROM Delivery
    GROUP BY customer_id
) t2
ON t1.customer_id = t2.customer_id;


