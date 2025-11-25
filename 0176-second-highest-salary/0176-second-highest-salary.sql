-- SELECT salary , dense_rank() over(ORDER BY salary desc) as  SecondHighestSalary FROM employee
-- limit 1 offset 1;

SELECT max(salary) as SecondHighestSalary FROM Employee
WHERE salary < (
    SELECT max(salary) FROM Employee
)