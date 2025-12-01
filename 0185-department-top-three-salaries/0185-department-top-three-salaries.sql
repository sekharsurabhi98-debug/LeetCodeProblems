

select d.name as Department, TB1.name as Employee, Salary FROM
(select * FROM
(
SELECT *
,DENSE_RANK() OVER (PARTITION BY departmentId ORDER BY salary DESC) as rnk
FROM Employee
) tb
WHERE rnk <= 3) TB1
JOIN Department d
ON d.id = TB1.departmentId

