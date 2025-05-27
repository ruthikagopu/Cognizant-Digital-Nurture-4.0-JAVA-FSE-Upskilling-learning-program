SELECT DISTINCT e.title
FROM Events e
JOIN Registrations r ON e.event_id = r.event_id
WHERE NOT EXISTS (
  SELECT 1 FROM Feedback f WHERE f.event_id = e.event_id
);
