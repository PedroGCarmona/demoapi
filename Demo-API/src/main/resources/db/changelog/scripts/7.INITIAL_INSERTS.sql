--liquibase formatted sql
--changeset pedro.carmona:7

INSERT INTO student (std_name) VALUES ('Pedro Gabriel Carmona');
INSERT INTO teacher (tch_name) VALUES ('Rodrigo Remor');
INSERT INTO school_subject (sbj_name) VALUES ('Linguagem de Programacao I');
INSERT INTO school_subject (sbj_name) VALUES ('Linguagem de Programacao II');
INSERT INTO school_subject (sbj_name) VALUES ('Banco de Dados I');
INSERT INTO school_subject (sbj_name) VALUES ('Banco de Dados II');
INSERT INTO school_subject (sbj_name) VALUES ('Topicos Especiais');

INSERT INTO teacher_subject VALUES (1,1);
INSERT INTO teacher_subject VALUES (1,2);
INSERT INTO teacher_subject VALUES (1,3);
INSERT INTO teacher_subject VALUES (1,4);
INSERT INTO teacher_subject VALUES (1,5);

INSERT INTO student_subject VALUES (1,1);
INSERT INTO student_subject VALUES (1,2);
INSERT INTO student_subject VALUES (1,3);
INSERT INTO student_subject VALUES (1,4);
INSERT INTO student_subject VALUES (1,5);

INSERT INTO teacher_student VALUES (1,1);