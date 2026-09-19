# Write your MySQL query statement below
select  firstName, lastName, city,state   
from person s
left join address a
on s.personId = a.personId