SELECT sell_date, count(distinct product) as num_sold,
GROUP_CONCAT(DISTINCT product ORDER BY product ASC separator ',') as products  
FROM Activities
GROUP BY sell_date