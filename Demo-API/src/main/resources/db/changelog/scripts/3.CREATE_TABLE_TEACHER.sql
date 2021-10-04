--liquibase formatted sql
--changeset pedro.carmona:3

CREATE TABLE `teacher` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `tch_name` varchar(250) NOT NULL,
  PRIMARY KEY (`id`)
);