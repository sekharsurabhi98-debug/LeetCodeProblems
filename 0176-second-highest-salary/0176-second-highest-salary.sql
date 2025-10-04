SELECT MAX(SALARY) as SecondHighestSalary FROM employee
WHERE salary < (select MAX(salary) FROM employee);