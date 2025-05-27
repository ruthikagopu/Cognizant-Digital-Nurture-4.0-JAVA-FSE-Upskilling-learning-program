SELECT u.full_name, e.title, e.start_date
FROM Users u
JOIN Registrations r ON u.user_id = r.user_id
JOIN Events e ON r.event_id = e.event_id
WHERE e.status = 'upcoming'
  AND EXISTS (
    SELECT 1 FROM Users u2 WHERE u2.user_id = u.user_id AND u2.city = e.city
  )
ORDER BY e.start_date;
