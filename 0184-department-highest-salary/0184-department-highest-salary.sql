
SELECT  d.name as Department , e.name as Employee, e.salary as Salary
FROM Employee e
JOIN Department d
ON e.departmentId = d.id
WHERE (e.departmentId, e.salary) in (
SELECT departmentId,max(salary)
FROM Employee 
GROUP BY departmentId
)


