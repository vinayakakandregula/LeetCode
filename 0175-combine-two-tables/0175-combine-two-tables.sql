SELECT p.firstname, p.lastname, a.city, a.state
FROM person p
LEFT OUTER JOIN address a ON p.personid = a.personid;
