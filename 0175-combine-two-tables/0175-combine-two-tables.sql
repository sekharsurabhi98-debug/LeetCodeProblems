SELECT p.firstName, p.lastName, a.city, state
FROM Person p
LEFT JOIN Address a
ON p.personId = a.personId
