SELECT u.full_name,
       COALESCE(COUNT(DISTINCT r.event_id), 0) AS events_attended,
       COALESCE(COUNT(DISTINCT f.feedback_id), 0) AS feedbacks_given
FROM Users u
LEFT JOIN Registrations r ON u.user_id = r.user_id
LEFT JOIN Feedback f ON u.user_id = f.user_id
GROUP BY u.user_id, u.full_name;
