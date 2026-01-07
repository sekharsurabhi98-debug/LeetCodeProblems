

SELECT  d.name as Department, e.name as Employee, e.salary as Salary
FROM Employee e
JOIN Department d
ON e.departmentId = d.id
WHERE (e.salary,e.departmentId) in (
    SELECT max(salary), departmentId FROM Employee
    GROUP BY DepartmentId
)
