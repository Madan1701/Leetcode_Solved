# Write your MySQL query statement below
SELECT u.name,sum(t.amount) AS balance
from users u JOIN transactions t ON 
u.account = t.account GROUP BY
u.account HAVING sum(t.amount)>10000;