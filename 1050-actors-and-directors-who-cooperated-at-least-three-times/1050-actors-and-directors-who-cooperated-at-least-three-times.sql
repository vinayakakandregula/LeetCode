select actor_id,director_id
from(select actor_id,director_id,count(timestamp) as cooperated 
from actordirector
group by actor_id,director_id
) table1
where cooperated >=3;
