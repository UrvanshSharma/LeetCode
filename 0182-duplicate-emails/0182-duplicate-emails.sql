# Write your MySQL query statement below
Select email
from Person
GROUP BY email
HAVING COUNT(*)>1