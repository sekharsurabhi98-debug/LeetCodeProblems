SELECT u.name, sum(t.amount) as balance
FROM users u
JOIN Transactions t
ON u.account = t.account
group by t.account
HAVING SUM(t.amount) > 10000;