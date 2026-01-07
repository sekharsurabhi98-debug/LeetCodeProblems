-- SELECT salary , dense_rank() over(ORDER BY salary desc) as  SecondHighestSalary FROM employee
-- limit 1 offset 1;

-- SELECT max(salary) as SecondHighestSalary
-- FROM Employee 
-- WHERE salary < (select max(salary) from employee)

SELECT 
(SELECT distinct salary FROM Employee
ORDER BY salary desc
limit 1 offset 1)
as SecondHighestSalary;