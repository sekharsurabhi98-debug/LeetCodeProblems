
SELECT MAX(salary) AS SecondHighestSalary
FROM Employee 
WHERE salary < (select MAX(salary) FROM Employee)