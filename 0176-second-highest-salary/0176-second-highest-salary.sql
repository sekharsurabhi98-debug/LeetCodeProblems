-- SELECT salary , dense_rank() over(ORDER BY salary desc) as  SecondHighestSalary FROM employee
-- limit 1 offset 1;

-- SELECT max(salary) as SecondHighestSalary
-- FROM Employee 
-- WHERE salary < (select max(salary) from employee)


SELECT MAX(salary) as SecondHighestSalary
FROM Employee 
WHERE salary < (SELECT MAX(salary) FROM Employee)