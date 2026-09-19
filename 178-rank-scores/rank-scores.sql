# Write your MySQL query statement below
select score,dense_rank() over(order by score desc) AS 'RANK'

from scores
-- SELECT score, DENSE_RANK() OVER (ORDER BY score DESC) 
-- FROM Scores 
-- ORDER BY score DESC;