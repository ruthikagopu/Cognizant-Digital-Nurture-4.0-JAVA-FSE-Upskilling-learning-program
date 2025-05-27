SELECT e.title, COUNT(*) AS session_count
FROM Sessions s
JOIN Events e ON s.event_id = e.event_id
WHERE CAST(s.start_time AS TIME) BETWEEN '10:00:00' AND '11:59:59'
GROUP BY e.event_id, e.title;
