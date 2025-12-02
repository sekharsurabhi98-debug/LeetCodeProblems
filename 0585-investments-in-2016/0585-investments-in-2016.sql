

select ROUND(SUM(tiv_2016),2) as tiv_2016 from Insurance e
where 1 < 
(SELECT count(tiv_2015) FROM Insurance
WHERE tiv_2015 = e.tiv_2015) AND pid IN (
SELECT pid
FROM Insurance
GROUP BY lat,lon
HAVING count(*) = 1
)


