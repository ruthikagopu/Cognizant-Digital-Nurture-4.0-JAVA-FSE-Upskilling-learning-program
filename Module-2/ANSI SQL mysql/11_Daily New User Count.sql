SELECT DATE(registration_date) AS registration_date, COUNT(*) AS new_users
FROM Users
WHERE registration_date >= CURDATE() - INTERVAL 7 DAY
GROUP BY DATE(registration_date);
