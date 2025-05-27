SELECT user_id, event_id, COUNT(*) AS total
FROM Registrations
GROUP BY user_id, event_id
HAVING COUNT(*) > 1;
