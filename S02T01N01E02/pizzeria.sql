-- MySQL Workbench Synchronization
-- Generated: 2023-04-24 16:54
-- Model: New Model
-- Version: 1.0
-- Project: Name of the project
-- Author: mac

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

CREATE TABLE IF NOT EXISTS `Pizzeria`.`client` (
  `idclient` INT(11) NOT NULL,
  `Nom` VARCHAR(45) NOT NULL,
  `Cognoms` VARCHAR(45) NOT NULL,
  `adreça_idadreça` INT(11) NOT NULL,
  PRIMARY KEY (`idclient`, `adreça_idadreça`),
  INDEX `fk_client_adreça_idx` (`adreça_idadreça` ASC) VISIBLE,
  CONSTRAINT `fk_client_adreça`
    FOREIGN KEY (`adreça_idadreça`)
    REFERENCES `Pizzeria`.`adreça` (`idadreça`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `Pizzeria`.`adreça` (
  `idadreça` INT(11) NOT NULL,
  `carrer` VARCHAR(45) NOT NULL,
  `codi postal` INT(11) NOT NULL,
  `localitat` VARCHAR(45) NOT NULL,
  `provincia` VARCHAR(45) NOT NULL,
  `telefon` INT(11) NOT NULL,
  PRIMARY KEY (`idadreça`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `Pizzeria`.`comanda` (
  `idcomanda` INT(11) NOT NULL,
  `data` DATETIME NOT NULL,
  `hora entrega` DATETIME NULL DEFAULT NULL,
  `entrega` ENUM('recollida', 'domicili') NOT NULL,
  `client_idclient` INT(11) NOT NULL,
  `client_adreça_idadreça` INT(11) NOT NULL,
  `empleat_idempleat` INT(11) NOT NULL,
  `empleat_botiga_idbotiga` INT(11) NOT NULL,
  `empleat_botiga_adreça_idadreça` INT(11) NOT NULL,
  `Preu total` DOUBLE NOT NULL,
  PRIMARY KEY (`idcomanda`, `client_idclient`, `client_adreça_idadreça`),
  INDEX `fk_comanda_client1_idx` (`client_idclient` ASC, `client_adreça_idadreça` ASC) VISIBLE,
  INDEX `fk_comanda_empleat1_idx` (`empleat_idempleat` ASC, `empleat_botiga_idbotiga` ASC, `empleat_botiga_adreça_idadreça` ASC) VISIBLE,
  CONSTRAINT `fk_comanda_client1`
    FOREIGN KEY (`client_idclient` , `client_adreça_idadreça`)
    REFERENCES `Pizzeria`.`client` (`idclient` , `adreça_idadreça`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_comanda_empleat1`
    FOREIGN KEY (`empleat_idempleat` , `empleat_botiga_idbotiga` , `empleat_botiga_adreça_idadreça`)
    REFERENCES `Pizzeria`.`empleat` (`idempleat` , `botiga_idbotiga` , `botiga_adreça_idadreça`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `Pizzeria`.`productes` (
  `idproductes` INT(11) NOT NULL,
  `Nom` VARCHAR(45) NOT NULL,
  `Descripció` VARCHAR(45) NOT NULL,
  `Imatge` VARCHAR(45) NOT NULL,
  `preu` DOUBLE NOT NULL,
  `categoria_idcategoria` INT(11) NOT NULL,
  PRIMARY KEY (`idproductes`),
  INDEX `fk_productes_categoria1_idx` (`categoria_idcategoria` ASC) VISIBLE,
  CONSTRAINT `fk_productes_categoria1`
    FOREIGN KEY (`categoria_idcategoria`)
    REFERENCES `Pizzeria`.`categoria` (`idcategoria`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `Pizzeria`.`comanda_has_productes` (
  `comanda_idcomanda` INT(11) NOT NULL,
  `productes_idproductes` INT(11) NOT NULL,
  `quantitat` INT(11) NOT NULL,
  PRIMARY KEY (`comanda_idcomanda`, `productes_idproductes`),
  INDEX `fk_comanda_has_productes_productes1_idx` (`productes_idproductes` ASC) VISIBLE,
  INDEX `fk_comanda_has_productes_comanda1_idx` (`comanda_idcomanda` ASC) VISIBLE,
  CONSTRAINT `fk_comanda_has_productes_comanda1`
    FOREIGN KEY (`comanda_idcomanda`)
    REFERENCES `Pizzeria`.`comanda` (`idcomanda`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_comanda_has_productes_productes1`
    FOREIGN KEY (`productes_idproductes`)
    REFERENCES `Pizzeria`.`productes` (`idproductes`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `Pizzeria`.`categoria` (
  `idcategoria` INT(11) NOT NULL,
  `Nomcategoria` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idcategoria`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `Pizzeria`.`botiga` (
  `idbotiga` INT(11) NOT NULL,
  `botiganom` VARCHAR(45) NULL DEFAULT NULL,
  `adreça_idadreça` INT(11) NOT NULL,
  PRIMARY KEY (`idbotiga`, `adreça_idadreça`),
  INDEX `fk_botiga_adreça1_idx` (`adreça_idadreça` ASC) VISIBLE,
  CONSTRAINT `fk_botiga_adreça1`
    FOREIGN KEY (`adreça_idadreça`)
    REFERENCES `Pizzeria`.`adreça` (`idadreça`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `Pizzeria`.`empleat` (
  `idempleat` INT(11) NOT NULL,
  `Nom` VARCHAR(45) NOT NULL,
  `Cognoms` VARCHAR(45) NOT NULL,
  `Telefon` INT(11) NOT NULL,
  `NIF` VARCHAR(45) NOT NULL,
  `tipusempleat` ENUM('cuina', 'repartidor') NOT NULL,
  `botiga_idbotiga` INT(11) NOT NULL,
  `botiga_adreça_idadreça` INT(11) NOT NULL,
  PRIMARY KEY (`idempleat`, `botiga_idbotiga`, `botiga_adreça_idadreça`),
  INDEX `fk_empleat_botiga1_idx` (`botiga_idbotiga` ASC, `botiga_adreça_idadreça` ASC) VISIBLE,
  CONSTRAINT `fk_empleat_botiga1`
    FOREIGN KEY (`botiga_idbotiga` , `botiga_adreça_idadreça`)
    REFERENCES `Pizzeria`.`botiga` (`idbotiga` , `adreça_idadreça`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
