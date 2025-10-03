SELECT m.employee_id, m.name, count(e.reports_to) as reports_count,
ROUND(sum(e.age)/ count(e.reports_to)) as average_age
FROM Employees e
JOIN Employees m
ON e.reports_to= m.employee_id
GROUP BY e.reports_to
ORDER BY m.employee_id ASC;
