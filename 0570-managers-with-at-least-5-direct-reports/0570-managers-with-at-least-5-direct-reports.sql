SELECT m.name FROM Employee e
JOIN Employee m
ON m.id = e.managerId
group by m.id
HAVING count(m.id) >= 5;
