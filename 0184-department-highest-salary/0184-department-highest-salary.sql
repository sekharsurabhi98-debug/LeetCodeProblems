select d.name as Department, e.name as Employee, e.salary as Salary
from Employee e
JOIN Department d
ON e.departmentId = d.id
WHERE e.salary = (
    select max(salary) from employee
    where e.departmentId = departmentId
)
