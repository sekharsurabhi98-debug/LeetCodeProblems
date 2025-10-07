SELECT user_id, email FROM Users
WHERE email REGEXP "^[a-zA-z0-9_]+@[a-zA-Z]+[.]com$";