SELECT et1.employee_id, ifnull(et2.department_id, min(et1.department_id)) as department_id 
FROM Employee et1
LEFT JOIN (
    SELECT employee_id,department_id
    FROM employee
    WHERE primary_flag = 'Y'
) et2
ON et2.employee_id  = et1.employee_id 
GROUP BY et1.employee_id;


