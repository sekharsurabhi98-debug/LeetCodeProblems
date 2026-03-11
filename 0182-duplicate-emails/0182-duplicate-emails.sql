SELECT Email
FROM Person
GROUP BY `email`
HAVING count(*) > 1

