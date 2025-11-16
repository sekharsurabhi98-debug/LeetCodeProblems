# Write your MySQL query statement below
SELECT e.name as Employee
FROM Employee e
JOIN Employee m
ON e.managerId = m.id
AND e.salary > m.salary 
