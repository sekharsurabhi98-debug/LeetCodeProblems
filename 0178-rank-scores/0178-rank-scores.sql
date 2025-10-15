SELECT score, dense_rank() over(ORDER BY SCORE DESC) as "rank"
FROM Scores;