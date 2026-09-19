# Write your MySQL query statement below
select DISTINCT max(salary) as SecondHighestSalary 
from Employee 
WHERE Salary < (
    SELECT MAX(Salary)
    FROM Employee
);