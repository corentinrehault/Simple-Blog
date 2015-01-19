# Drop+Create simpleblog

USE mysql;
DROP DATABASE IF EXISTS `simpleblog`;
CREATE DATABASE `simpleblog`;
USE simpleblog;

# Drop

#ALTER TABLE Commentaire DROP FOREIGN KEY FKCommentair387310;
#ALTER TABLE Utilisateur DROP FOREIGN KEY FKUtilisateu128246;
#ALTER TABLE Commentaire DROP FOREIGN KEY FKCommentair204829;
#ALTER TABLE Article DROP FOREIGN KEY `{Utilisateur.authority == admin}`;
#ALTER TABLE Categorie DROP FOREIGN KEY FKCategorie368955;
#ALTER TABLE FicheUtilisateur DROP FOREIGN KEY FKFicheUtili623214;
#ALTER TABLE Interet DROP FOREIGN KEY FKInteret245852;
#ALTER TABLE Utilisateur DROP FOREIGN KEY FKUtilisateu790706;
DROP TABLE IF EXISTS Interet;
DROP TABLE IF EXISTS FicheUtilisateur;
DROP TABLE IF EXISTS Pays;
DROP TABLE IF EXISTS Categorie;
DROP TABLE IF EXISTS Style;
DROP TABLE IF EXISTS Utilisateur;
DROP TABLE IF EXISTS Article;
DROP TABLE IF EXISTS Commentaire;

# Create

CREATE TABLE Interet (
  Id                 int(11) NOT NULL AUTO_INCREMENT, 
  FicheUtilisateurId int(11) NOT NULL, 
  Nom                varchar(255) UNIQUE, 
  PRIMARY KEY (Id)) CHARACTER SET UTF8;
CREATE TABLE FicheUtilisateur (
  Id         int(11) NOT NULL AUTO_INCREMENT, 
  PaysId     int(11) NOT NULL, 
  Adresse    varchar(255), 
  Ville      varchar(255), 
  CodePostal int(11), 
  PRIMARY KEY (Id)) CHARACTER SET UTF8;
CREATE TABLE Pays (
  Id  int(11) NOT NULL AUTO_INCREMENT, 
  Nom varchar(255) NOT NULL UNIQUE, 
  PRIMARY KEY (Id)) CHARACTER SET UTF8;
CREATE TABLE Categorie (
  Id        int(11) NOT NULL AUTO_INCREMENT, 
  ArticleId int(11) NOT NULL, 
  Nom       varchar(255), 
  PRIMARY KEY (Id)) CHARACTER SET UTF8;
CREATE TABLE Style (
  Id  int(11) NOT NULL AUTO_INCREMENT, 
  Nom varchar(255) NOT NULL UNIQUE, 
  PRIMARY KEY (Id)) CHARACTER SET UTF8;
CREATE TABLE Utilisateur (
  Id                 int(11) NOT NULL AUTO_INCREMENT, 
  StyleId            int(11) NOT NULL, 
  FicheUtilisateurId int(11) NOT NULL, 
  Nom                varchar(255) NOT NULL, 
  Prenom             varchar(255) NOT NULL, 
  Login              varchar(255) NOT NULL UNIQUE, 
  Password           varchar(255) NOT NULL UNIQUE, 
  Mail               varchar(255) NOT NULL UNIQUE, 
  Avatar             varchar(255), 
  Langue             varchar(255) NOT NULL, 
  Authority          varchar(255) NOT NULL, 
  PRIMARY KEY (Id)) CHARACTER SET UTF8;
CREATE TABLE Article (
  Id            int(11) NOT NULL AUTO_INCREMENT, 
  UtilisateurId int(11) NOT NULL, 
  DateCreation  date NOT NULL, 
  Titre         varchar(255) NOT NULL UNIQUE, 
  Contenu       varchar(255) NOT NULL UNIQUE, 
  PRIMARY KEY (Id)) CHARACTER SET UTF8;
CREATE TABLE Commentaire (
  Id            int(11) NOT NULL AUTO_INCREMENT, 
  UtilisateurId int(11) NOT NULL, 
  ArticleId     int(11) NOT NULL, 
  `Date`        date NOT NULL, 
  Titre         varchar(255) NOT NULL, 
  Contenu       varchar(255) NOT NULL UNIQUE, 
  Valide        tinyint(1) NOT NULL, 
  PRIMARY KEY (Id)) CHARACTER SET UTF8;
ALTER TABLE Commentaire ADD INDEX FKCommentair387310 (ArticleId), ADD CONSTRAINT FKCommentair387310 FOREIGN KEY (ArticleId) REFERENCES Article (Id);
ALTER TABLE Utilisateur ADD INDEX FKUtilisateu128246 (FicheUtilisateurId), ADD CONSTRAINT FKUtilisateu128246 FOREIGN KEY (FicheUtilisateurId) REFERENCES FicheUtilisateur (Id);
ALTER TABLE Commentaire ADD INDEX FKCommentair204829 (UtilisateurId), ADD CONSTRAINT FKCommentair204829 FOREIGN KEY (UtilisateurId) REFERENCES Utilisateur (Id);
ALTER TABLE Article ADD INDEX `{Utilisateur.authority == admin}` (UtilisateurId), ADD CONSTRAINT `{Utilisateur.authority == admin}` FOREIGN KEY (UtilisateurId) REFERENCES Utilisateur (Id);
ALTER TABLE Categorie ADD INDEX FKCategorie368955 (ArticleId), ADD CONSTRAINT FKCategorie368955 FOREIGN KEY (ArticleId) REFERENCES Article (Id);
ALTER TABLE FicheUtilisateur ADD INDEX FKFicheUtili623214 (PaysId), ADD CONSTRAINT FKFicheUtili623214 FOREIGN KEY (PaysId) REFERENCES Pays (Id);
ALTER TABLE Interet ADD INDEX FKInteret245852 (FicheUtilisateurId), ADD CONSTRAINT FKInteret245852 FOREIGN KEY (FicheUtilisateurId) REFERENCES FicheUtilisateur (Id);
ALTER TABLE Utilisateur ADD INDEX FKUtilisateu790706 (StyleId), ADD CONSTRAINT FKUtilisateu790706 FOREIGN KEY (StyleId) REFERENCES Style (Id);

# Utilisateurs

INSERT INTO `Style`VALUES (1,'Base');
INSERT INTO `Pays` VALUES (1,'France');
INSERT INTO `Ficheutilisateur` VALUES (1,1,'1, rue de la mairie','rennes','35000');
INSERT INTO `Ficheutilisateur` VALUES (2,1,'2, rue de la mairie','rennes','35000');
INSERT INTO `Ficheutilisateur` VALUES (3,1,'3, rue de la mairie','rennes','35000');
INSERT INTO `Ficheutilisateur` VALUES (4,1,'4, rue de la mairie','rennes','35000');
INSERT INTO `Ficheutilisateur` VALUES (5,1,'5, rue de la mairie','rennes','35000');
INSERT INTO `Utilisateur` VALUES (1,1,1,'Lafosse','Jerome','jlafosse','jerome','jlafosse@simpleblog.fr','\images\aide.jpg','fr','user');
INSERT INTO `Utilisateur` VALUES (2,1,2,'Stapane','Amelie','astapane','amelie','astapane@simpleblog.fr','\images\aide.jpg','fr','user');
INSERT INTO `Utilisateur` VALUES (3,1,3,'Martin','Alain','amartin','alain','amartin@simpleblog.fr','\images\aide.jpg','en','user');
INSERT INTO `Utilisateur` VALUES (4,1,4,'Leroy','Pierre','pleroy','pierre','pleroy@simpleblog.fr','\images\aide.jpg','en','user');
INSERT INTO `Utilisateur` VALUES (5,1,5,'Abitbol','Georges','gabitbol','georges','gabitbol@simpleblog.fr','\images\aide.jpg','fr','admin');