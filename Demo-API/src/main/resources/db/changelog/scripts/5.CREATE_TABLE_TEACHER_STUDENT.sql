--liquibase formatted sql
--changeset pedro.carmona:5

CREATE TABLE `teacher_student` (
  `teacher_id` bigint DEFAULT NULL,
  `student_id` bigint DEFAULT NULL,
  KEY `teacher_id` (`teacher_id`),
  KEY `student_id` (`student_id`),
  CONSTRAINT `teacher_student_ibfk_1` FOREIGN KEY (`teacher_id`) REFERENCES `teacher` (`id`) ON DELETE CASCADE,
  CONSTRAINT `teacher_student_ibfk_2` FOREIGN KEY (`student_id`) REFERENCES `student` (`id`) ON DELETE CASCADE
);