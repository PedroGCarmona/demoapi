--liquibase formatted sql
--changeset pedro.carmona:1

CREATE TABLE `school_subject` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `sbj_name` varchar(250) NOT NULL,
  PRIMARY KEY (`id`)
);