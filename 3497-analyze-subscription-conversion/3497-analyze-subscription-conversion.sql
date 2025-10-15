SELECT user_id,
ROUND(SUM(CASE WHEN activity_type = "free_trial" THEN activity_duration ELSE 0 END) / 
SUM(CASE WHEN activity_type  = "free_trial" THEN 1 ELSE 0 END), 2) as trial_avg_duration,
ROUND(SUM(CASE WHEN activity_type = "paid" THEN activity_duration ELSE 0 END) / 
SUM(CASE WHEN activity_type  = "paid" THEN 1 ELSE 0 END), 2) as paid_avg_duration
FROM UserActivity
GROUP BY user_id
HAVING SUM(CASE WHEN activity_type  = "free_trial" THEN 1 ELSE 0 END) > 0 AND 
SUM(CASE WHEN activity_type  = "paid" THEN 1 ELSE 0 END) > 0
ORDER BY user_id;