SELECT s1.event_id, s1.session_id, s2.session_id
FROM Sessions s1
WHERE EXISTS (
  SELECT 1 FROM Sessions s2
  WHERE s1.event_id = s2.event_id
    AND s1.session_id < s2.session_id
    AND s1.end_time > s2.start_time
    AND s1.start_time < s2.end_time
);
