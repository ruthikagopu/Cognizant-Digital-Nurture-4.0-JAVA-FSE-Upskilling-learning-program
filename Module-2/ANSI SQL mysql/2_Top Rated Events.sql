SELECT e.title, AVG(f.rating) AS avg_rating, COUNT(f.rating) AS feedback_count
FROM Events e
JOIN Feedback f ON e.event_id = f.event_id
GROUP BY e.event_id, e.title
HAVING COUNT(f.rating) >= 10
ORDER BY avg_rating DESC;