-- MySQL Workbench Synchronization
-- Generated: 2023-04-20 15:46
-- Model: New Model
-- Version: 1.0
-- Project: Name of the project
-- Author: mac

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

CREATE SCHEMA IF NOT EXISTS `CuldAmpolla` DEFAULT CHARACTER SET utf8 ;

CREATE TABLE IF NOT EXISTS `CuldAmpolla`.`proveidor` (
  `idproveidor` INT(11) NOT NULL AUTO_INCREMENT,
  `nomproveidor` VARCHAR(45) NOT NULL,
  `adreça_idadreça` INT(11) NOT NULL,
  `telefon` INT(11) NOT NULL,
  `fax` INT(11) NULL DEFAULT NULL,
  `NIF` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idproveidor`),
  INDEX `fk_proveidor_adreça_idx` (`adreça_idadreça` ASC) VISIBLE,
  UNIQUE INDEX `NIF_UNIQUE` (`NIF` ASC) VISIBLE,
  CONSTRAINT `fk_proveidor_adreça`
    FOREIGN KEY (`adreça_idadreça`)
    REFERENCES `CuldAmpolla`.`adreça` (`idadreça`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `CuldAmpolla`.`adreça` (
  `idadreça` INT(11) NOT NULL AUTO_INCREMENT,
  `carrer` VARCHAR(45) NOT NULL,
  `numero` INT(11) NOT NULL,
  `pis` VARCHAR(45) NULL DEFAULT NULL,
  `porta` VARCHAR(2) NULL DEFAULT NULL,
  `ciutat` VARCHAR(45) NOT NULL,
  `codi postal` INT(11) NOT NULL,
  `pais` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idadreça`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `CuldAmpolla`.`ulleres` (
  `idulleres` INT(11) NOT NULL AUTO_INCREMENT,
  `marca` VARCHAR(45) NOT NULL,
  `graduaciovidredret` DECIMAL(3) NOT NULL,
  `tipusmuntura` ENUM('flotant', 'pasta', 'metàl·lica') NOT NULL,
  `colormuntura` VARCHAR(45) NOT NULL,
  `colorvidre` VARCHAR(45) NOT NULL,
  `preu` DOUBLE NOT NULL,
  `proveidor_idproveidor` INT(11) NOT NULL,
  PRIMARY KEY (`idulleres`),
  INDEX `fk_ulleres_proveidor1_idx` (`proveidor_idproveidor` ASC) VISIBLE,
  CONSTRAINT `fk_ulleres_proveidor1`
    FOREIGN KEY (`proveidor_idproveidor`)
    REFERENCES `CuldAmpolla`.`proveidor` (`idproveidor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `CuldAmpolla`.`clients` (
  `idclients` INT(11) NOT NULL AUTO_INCREMENT,
  `nom` VARCHAR(45) NOT NULL,
  `adreça_idadreça` INT(11) NOT NULL,
  `telèfon` INT(11) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `dataregistre` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `clientreferenciat` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`idclients`),
  INDEX `fk_clients_adreça1_idx` (`adreça_idadreça` ASC) VISIBLE,
  INDEX `fk_clients_clients1_idx` (`clientreferenciat` ASC) VISIBLE,
  CONSTRAINT `fk_clients_adreça1`
    FOREIGN KEY (`adreça_idadreça`)
    REFERENCES `CuldAmpolla`.`adreça` (`idadreça`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_clients_clients1`
    FOREIGN KEY (`clientreferenciat`)
    REFERENCES `CuldAmpolla`.`clients` (`idclients`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `CuldAmpolla`.`empleat` (
  `idempleat` INT(11) NOT NULL,
  `numerotreballador` INT(11) NOT NULL,
  `Nom` VARCHAR(45) NOT NULL,
  `Cognom` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idempleat`),
  UNIQUE INDEX `numerotreballador_UNIQUE` (`numerotreballador` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `CuldAmpolla`.`vendes` (
  `idvendes` INT(11) NOT NULL,
  `empleat_idempleat` INT(11) NOT NULL,
  `clients_idclients` INT(11) NOT NULL,
  PRIMARY KEY (`idvendes`),
  INDEX `fk_vendes_empleat1_idx` (`empleat_idempleat` ASC) VISIBLE,
  INDEX `fk_vendes_clients1_idx` (`clients_idclients` ASC) VISIBLE,
  CONSTRAINT `fk_vendes_empleat1`
    FOREIGN KEY (`empleat_idempleat`)
    REFERENCES `CuldAmpolla`.`empleat` (`idempleat`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_vendes_clients1`
    FOREIGN KEY (`clients_idclients`)
    REFERENCES `CuldAmpolla`.`clients` (`idclients`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `CuldAmpolla`.`ulleres_has_vendes` (
  `ulleres_idulleres` INT(11) NOT NULL,
  `vendes_idvendes` INT(11) NOT NULL,
  PRIMARY KEY (`ulleres_idulleres`, `vendes_idvendes`),
  INDEX `fk_ulleres_has_vendes_vendes1_idx` (`vendes_idvendes` ASC) VISIBLE,
  INDEX `fk_ulleres_has_vendes_ulleres1_idx` (`ulleres_idulleres` ASC) VISIBLE,
  CONSTRAINT `fk_ulleres_has_vendes_ulleres1`
    FOREIGN KEY (`ulleres_idulleres`)
    REFERENCES `CuldAmpolla`.`ulleres` (`idulleres`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ulleres_has_vendes_vendes1`
    FOREIGN KEY (`vendes_idvendes`)
    REFERENCES `CuldAmpolla`.`vendes` (`idvendes`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
