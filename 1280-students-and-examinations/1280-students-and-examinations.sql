SELECT std.student_id, std.student_name, sub.subject_name, ifnull(count(e.subject_name),0) as attended_exams
FROM students std
CROSS JOIN subjects sub
LEFT JOIN examinations e
ON std.student_id = e.student_id
AND sub.subject_name  = e.subject_name
GROUP BY std.student_id, sub.subject_name
ORDER BY std.student_id, sub.subject_name;
