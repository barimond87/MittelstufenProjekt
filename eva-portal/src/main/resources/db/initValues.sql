INSERT INTO eva_portal.teacher
(id, email, first_name, name)
VALUES(1,'marcel.vieren@intellinet.de', 'Marcel', 'Vieren');


INSERT INTO eva_portal.`user`
(id, passwort, username, student_id, teacher_id)
VALUES(1,'test', 'marcel.vieren@intellinet.de',NULL, 1);
