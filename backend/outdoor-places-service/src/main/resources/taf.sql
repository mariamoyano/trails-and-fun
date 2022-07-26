DROP SCHEMA IF EXISTS taf;
CREATE SCHEMA taf;
USE taf;

CREATE TABLE IF NOT EXISTS `taf`.`trail` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `user_id` BIGINT NOT NULL,
  `address` VARCHAR(255) NULL DEFAULT NULL,
  `description` VARCHAR(255) NOT NULL,
  `difficulty` VARCHAR(255) NULL DEFAULT NULL,
  `image` VARCHAR(255) NULL DEFAULT NULL,
  `latitude` VARCHAR(255) NULL DEFAULT NULL,
  `length` VARCHAR(255) NULL DEFAULT NULL,
  `longitude` VARCHAR(255) NULL DEFAULT NULL,
  `name` VARCHAR(255) NOT NULL,
  `region` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


INSERT INTO `taf`.`trail` (`id`, `user_id`, `address`, `description`, `difficulty`, `image`, `latitude`, `length`, `longitude`, `name`, `region`) VALUES (1, 3, 'Address1', 'Decription1', 'EASY', 'https://4.bp.blogspot.com/-lRLBcLfZAVA/W2NKbT3geYI/AAAAAAAAJvg/V3ZRE0faHRoltW5N1mlIDajefSb3G_0-gCKgBGAs/s1600/IMG_6735.jpg', '40', '10', '40', 'Name1', 'MADRID');
INSERT INTO `taf`.`trail` (`id`, `user_id`, `address`, `description`, `difficulty`, `image`, `latitude`, `length`, `longitude`, `name`, `region`) VALUES (2, 3, 'Address2', 'Descrpition2 ddddd', 'MODERATE', 'https://4.bp.blogspot.com/-lRLBcLfZAVA/W2NKbT3geYI/AAAAAAAAJvg/V3ZRE0faHRoltW5N1mlIDajefSb3G_0-gCKgBGAs/s1600/IMG_6735.jpg', '41', '5', '42', 'Name2', 'MADRID');









