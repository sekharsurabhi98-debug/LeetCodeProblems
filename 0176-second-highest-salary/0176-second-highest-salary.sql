-- SELECT salary , dense_rank() over(ORDER BY salary desc) as  SecondHighestSalary FROM employee
-- limit 1 offset 1;

-- SELECT max(salary) as SecondHighestSalary
-- FROM Employee 
-- WHERE salary < (select max(salary) from employee)

-- SELECT max(salary) as SecondHighestSalary FROM
-- (SELECT * , dense_rank() over(ORDER BY salary DESC) as s
-- FROM Employee) t
-- WHERE s = 2;

SELECT (
    SELECT DISTINCT Salary
    FROM Employee
    LIMIT 1 OFFSET 1
   ) AS SecondHighestSalary