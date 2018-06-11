INSERT INTO eva_portal.teacher
(id, email, first_name, name)
VALUES(1,'marcel.vieren@intellinet.de', 'Marcel', 'Vieren');


INSERT INTO eva_portal.`user`
(id, passwort, username, student_id, teacher_id)
VALUES(1,'test', 'marcel.vieren@intellinet.de',NULL, 1);


INSERT INTO eva_portal.teacher
(id, email, first_name, name)
VALUES(2,'ben.arimond@intellinet.de', 'Ben', 'Arimond');


INSERT INTO eva_portal.`user`
(id, passwort, username, student_id, teacher_id)
VALUES(2,'test', 'ben.arimond @intellinet.de',NULL, 1);


INSERT INTO eva_portal.class
(id, name)
VALUES(1,'FIA-62');

INSERT INTO eva_portal.student
(id, email, first_name, name,class_id)
VALUES(1,'student@intellinet.de', 'Max', 'Mustermann',1);


INSERT INTO eva_portal.`user`
(id, passwort, username, student_id, teacher_id)
VALUES(3,'test', 'student@intellinet.de',1,NULL);
