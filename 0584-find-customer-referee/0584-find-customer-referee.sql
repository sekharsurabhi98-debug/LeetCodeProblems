SELECT name 
FROM Customer c
WHERE referee_id IS NULL OR referee_id != 2;