SELECT contest_id,
ROUND(count(user_id) / (SELECT count(user_id) FROM Users),4) * 100 as percentage
FROM Register
GROUP BY contest_id
ORDER BY percentage DESC ,contest_id ;