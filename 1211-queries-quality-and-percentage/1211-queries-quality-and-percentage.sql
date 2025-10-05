SELECT query_name,ROUND(sum((rating / position)) / count(query_name),2) as quality, 
ROUND(SUM(rating < 3) / count(query_name)*100,2) as poor_query_percentage FROM Queries
GROUP BY query_name;
