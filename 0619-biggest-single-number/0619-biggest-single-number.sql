SELECT MAX(NUM) as num
FROM (SELECT NUM FROM MYNUMBERS GROUP BY 1 HAVING COUNT(1)=1) AS t;