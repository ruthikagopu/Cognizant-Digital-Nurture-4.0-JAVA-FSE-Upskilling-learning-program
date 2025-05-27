SELECT city, total_users
FROM (
  SELECT u.city, COUNT(DISTINCT r.user_id) AS total_users
  FROM Users u
  JOIN Registrations r ON u.user_id = r.user_id
  GROUP BY u.city
) AS city_counts
ORDER BY total_users DESC
LIMIT 5;
