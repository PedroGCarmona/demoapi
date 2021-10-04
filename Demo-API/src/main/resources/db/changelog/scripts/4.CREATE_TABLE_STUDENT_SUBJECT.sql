--liquibase formatted sql
--changeset pedro.carmona:4

CREATE TABLE `student_subject` (
  `student_id` bigint DEFAULT NULL,
  `subject_id` bigint DEFAULT NULL,
  KEY `student_id` (`student_id`),
  KEY `subject_id` (`subject_id`),
  CONSTRAINT `student_subject_ibfk_1` FOREIGN KEY (`student_id`) REFERENCES `student` (`id`) ON DELETE CASCADE,
  CONSTRAINT `student_subject_ibfk_2` FOREIGN KEY (`subject_id`) REFERENCES `school_subject` (`id`) ON DELETE CASCADE
);