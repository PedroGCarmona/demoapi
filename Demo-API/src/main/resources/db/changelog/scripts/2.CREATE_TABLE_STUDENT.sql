--liquibase formatted sql
--changeset pedro.carmona:2

CREATE TABLE `student` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `std_name` varchar(250) NOT NULL,
  PRIMARY KEY (`id`)
);