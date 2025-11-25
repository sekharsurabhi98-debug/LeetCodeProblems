SELECT ROUND(count(*) / (select count(distinct player_id) FROM Activity) ,2) as fraction
FROM 
(SELECT count(*)
FROM Activity t1
JOIN (
    SELECT player_id,min(event_date) as event_date
    FROM Activity
    GROUP BY player_id
) t2
ON t1.player_id = t2.player_id
WHERE DATEDIFF(t1.event_date, t2.event_date) = 1
GROUP BY t1.player_id
) tb