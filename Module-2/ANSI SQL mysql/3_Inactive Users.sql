SELECT u.*
FROM Users u
LEFT JOIN Registrations r ON u.user_id = r.user_id
  AND r.registration_date >= CURDATE() - INTERVAL 90 DAY
WHERE r.user_id IS NULL;