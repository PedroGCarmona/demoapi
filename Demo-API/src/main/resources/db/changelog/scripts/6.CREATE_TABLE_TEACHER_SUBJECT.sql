--liquibase formatted sql
--changeset pedro.carmona:6

CREATE TABLE `teacher_subject` (
  `teacher_id` bigint DEFAULT NULL,
  `subject_id` bigint DEFAULT NULL,
  KEY `teacher_id` (`teacher_id`),
  KEY `subject_id` (`subject_id`),
  CONSTRAINT `teacher_subject_ibfk_1` FOREIGN KEY (`teacher_id`) REFERENCES `teacher` (`id`) ON DELETE CASCADE,
  CONSTRAINT `teacher_subject_ibfk_2` FOREIGN KEY (`subject_id`) REFERENCES `school_subject` (`id`) ON DELETE CASCADE
);