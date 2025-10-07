SELECT 
    machine_id,
    ROUND(SUM(Diff) / COUNT(process_id), 3) AS processing_time
FROM (
    SELECT 
        machine_id, 
        process_id, 
        MAX(timestamp) - MIN(timestamp) AS Diff
    FROM Activity
    GROUP BY machine_id, process_id
) AS t2
GROUP BY machine_id;
