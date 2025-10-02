SELECT m.name FROM Employee e
JOIN Employee m
ON m.id = e.managerId
group by m.name
HAVING count(m.name) >= 5;
