SELECT p.project_id, sum(e.experience_years) / count(e.employee_id) as average_years
FROM project p
JOIN Employee e
ON p.employee_id = e.employee_id
group by p.project_id;