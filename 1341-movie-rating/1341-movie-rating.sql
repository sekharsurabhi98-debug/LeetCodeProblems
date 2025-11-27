SELECT * FROM
(SELECT name AS results
FROM (
    SELECT u.user_id,u.name as name, COUNT(*) AS cnt
    FROM Users u
    JOIN MovieRating r ON u.user_id = r.user_id
    GROUP BY u.user_id
) t
ORDER BY cnt DESC, name ASC
LIMIT 1 ) names_user
UNION ALL
SELECT * FROM
(
SELECT title as results
FROM
(
SELECT mv.movie_id,mv.title as title, avg(rating) as max_rating
FROM movies mv
JOIN MovieRating mr 
ON mv.movie_id = mr.movie_id
WHERE mr.created_at BETWEEN '2020-02-01' AND '2020-02-29'
GROUP BY mv.movie_id
) tb4
ORDER BY max_rating desc,title ASC
limit 1 ) as t