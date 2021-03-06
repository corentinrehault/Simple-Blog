# Drop+Create simpleblog

USE mysql;
DROP DATABASE IF EXISTS `simpleblog`;
CREATE DATABASE `simpleblog`;
USE simpleblog;

# Drop

#ALTER TABLE Commentaire DROP FOREIGN KEY FKCommentair654983;
#ALTER TABLE Utilisateur DROP FOREIGN KEY FKUtilisateu943634;
#ALTER TABLE Commentaire DROP FOREIGN KEY FKCommentair642299;
#ALTER TABLE Article DROP FOREIGN KEY `{Utilisateur.authority == admin}`;
#ALTER TABLE Categorie DROP FOREIGN KEY FKCategorie672911;
#ALTER TABLE Utilisateur DROP FOREIGN KEY FKUtilisateu373543;
#ALTER TABLE Authority_Utilisateur DROP FOREIGN KEY FKAuthority_73041;
#ALTER TABLE Authority_Utilisateur DROP FOREIGN KEY FKAuthority_957568;
#ALTER TABLE Interet_FicheUtilisateur DROP FOREIGN KEY FKInteret_Fi655360;
#ALTER TABLE Interet_FicheUtilisateur DROP FOREIGN KEY FKInteret_Fi508709;
#ALTER TABLE FicheUtilisateur DROP FOREIGN KEY FKFicheUtili623214;
DROP TABLE IF EXISTS Authority_Utilisateur;
DROP TABLE IF EXISTS Authority;
DROP TABLE IF EXISTS Commentaire;
DROP TABLE IF EXISTS Interet_FicheUtilisateur;
DROP TABLE IF EXISTS Article;
DROP TABLE IF EXISTS Categorie;
DROP TABLE IF EXISTS Utilisateur;
DROP TABLE IF EXISTS FicheUtilisateur;
DROP TABLE IF EXISTS Interet;
DROP TABLE IF EXISTS Pays;
DROP TABLE IF EXISTS Style;






# Create

CREATE TABLE Authority_Utilisateur (
  AuthorityId_a_u   int(11) NOT NULL, 
  UtilisateurId_a_u int(11) NOT NULL, 
  PRIMARY KEY (AuthorityId_a_u, 
  UtilisateurId_a_u)) CHARACTER SET UTF8;
CREATE TABLE Authority (
  Id        int(11) NOT NULL AUTO_INCREMENT, 
  Authority varchar(255) NOT NULL UNIQUE, 
  PRIMARY KEY (Id)) CHARACTER SET UTF8;
CREATE TABLE Interet (
  Id  int(11) NOT NULL AUTO_INCREMENT, 
  Nom varchar(255) NOT NULL UNIQUE, 
  PRIMARY KEY (Id)) CHARACTER SET UTF8;
CREATE TABLE FicheUtilisateur (
  Id         int(11) NOT NULL AUTO_INCREMENT, 
  PaysId     int(11), 
  Adresse    varchar(255), 
  Ville      varchar(255), 
  CodePostal int(11), 
  PRIMARY KEY (Id)) CHARACTER SET UTF8;
CREATE TABLE Pays (
  Id       int(11) NOT NULL AUTO_INCREMENT, 
  Nom      varchar(255) NOT NULL UNIQUE, 
  Codepays varchar(2) NOT NULL UNIQUE, 
  PRIMARY KEY (Id)) CHARACTER SET UTF8;
CREATE TABLE Categorie (
  Id            int(11) NOT NULL AUTO_INCREMENT, 
  ArticleId_cat int(11) NOT NULL, 
  Nom           varchar(255) NOT NULL UNIQUE, 
  PRIMARY KEY (Id)) CHARACTER SET UTF8;
CREATE TABLE Style (
  Id  int(11) NOT NULL AUTO_INCREMENT, 
  Nom varchar(255) NOT NULL UNIQUE, 
  PRIMARY KEY (Id)) CHARACTER SET UTF8;
CREATE TABLE Utilisateur (
  Id                      int(11) NOT NULL AUTO_INCREMENT, 
  StyleId_uti             int(11), 
  FicheUtilisateurId_uti  int(11), 
  Nom                     varchar(255) NOT NULL, 
  Prenom                  varchar(255) NOT NULL, 
  Username                varchar(255) NOT NULL UNIQUE, 
  Password                varchar(255) NOT NULL, 
  Mail                    varchar(255) NOT NULL UNIQUE, 
  Avatar                  varchar(255), 
  Langue                  varchar(255) DEFAULT 'fr' NOT NULL, 
  IsEnabled               tinyint(1) DEFAULT 1 NOT NULL, 
  IsAccountNonExpired     tinyint(1) DEFAULT 1 NOT NULL, 
  IsAccountNonLocked      tinyint(1) DEFAULT 1 NOT NULL, 
  IsCredentialsNonExpired tinyint(1) DEFAULT 1 NOT NULL, 
  PRIMARY KEY (Id)) CHARACTER SET UTF8;
CREATE TABLE Article (
  Id                int(11) NOT NULL AUTO_INCREMENT, 
  UtilisateurId_art int(11) NOT NULL, 
  DateCreation      date NOT NULL, 
  Titre             varchar(255) NOT NULL, 
  Contenu           varchar(255) NOT NULL, 
  PRIMARY KEY (Id)) CHARACTER SET UTF8;
CREATE TABLE Commentaire (
  Id                int(11) NOT NULL AUTO_INCREMENT, 
  UtilisateurId_com int(11) NOT NULL, 
  ArticleId_com     int(11) NOT NULL, 
  `Date`            date NOT NULL, 
  Titre             varchar(255) NOT NULL, 
  Contenu           varchar(255) NOT NULL, 
  Valide            tinyint(1) DEFAULT 0 NOT NULL, 
  PRIMARY KEY (Id)) CHARACTER SET UTF8;
CREATE TABLE Interet_FicheUtilisateur (
  InteretId_i__f         int(11) NOT NULL, 
  FicheUtilisateurId_i_f int(11) NOT NULL, 
  PRIMARY KEY (InteretId_i__f, 
  FicheUtilisateurId_i_f)) CHARACTER SET UTF8;
ALTER TABLE Commentaire ADD INDEX FKCommentair654983 (ArticleId_com), ADD CONSTRAINT FKCommentair654983 FOREIGN KEY (ArticleId_com) REFERENCES Article (Id);
ALTER TABLE Utilisateur ADD INDEX FKUtilisateu943634 (FicheUtilisateurId_uti), ADD CONSTRAINT FKUtilisateu943634 FOREIGN KEY (FicheUtilisateurId_uti) REFERENCES FicheUtilisateur (Id);
ALTER TABLE Commentaire ADD INDEX FKCommentair642299 (UtilisateurId_com), ADD CONSTRAINT FKCommentair642299 FOREIGN KEY (UtilisateurId_com) REFERENCES Utilisateur (Id);
ALTER TABLE Article ADD INDEX `{Utilisateur.authority == admin}` (UtilisateurId_art), ADD CONSTRAINT `{Utilisateur.authority == admin}` FOREIGN KEY (UtilisateurId_art) REFERENCES Utilisateur (Id);
ALTER TABLE Categorie ADD INDEX FKCategorie672911 (ArticleId_cat), ADD CONSTRAINT FKCategorie672911 FOREIGN KEY (ArticleId_cat) REFERENCES Article (Id);
ALTER TABLE Utilisateur ADD INDEX FKUtilisateu373543 (StyleId_uti), ADD CONSTRAINT FKUtilisateu373543 FOREIGN KEY (StyleId_uti) REFERENCES Style (Id);
ALTER TABLE Authority_Utilisateur ADD INDEX FKAuthority_73041 (AuthorityId_a_u), ADD CONSTRAINT FKAuthority_73041 FOREIGN KEY (AuthorityId_a_u) REFERENCES Authority (Id);
ALTER TABLE Authority_Utilisateur ADD INDEX FKAuthority_957568 (UtilisateurId_a_u), ADD CONSTRAINT FKAuthority_957568 FOREIGN KEY (UtilisateurId_a_u) REFERENCES Utilisateur (Id);
ALTER TABLE Interet_FicheUtilisateur ADD INDEX FKInteret_Fi655360 (InteretId_i__f), ADD CONSTRAINT FKInteret_Fi655360 FOREIGN KEY (InteretId_i__f) REFERENCES Interet (Id);
ALTER TABLE Interet_FicheUtilisateur ADD INDEX FKInteret_Fi508709 (FicheUtilisateurId_i_f), ADD CONSTRAINT FKInteret_Fi508709 FOREIGN KEY (FicheUtilisateurId_i_f) REFERENCES FicheUtilisateur (Id);
ALTER TABLE FicheUtilisateur ADD INDEX FKFicheUtili623214 (PaysId), ADD CONSTRAINT FKFicheUtili623214 FOREIGN KEY (PaysId) REFERENCES Pays (Id) ON UPDATE CASCADE ON DELETE SET null;

# Utilisateurs

#INSERT INTO `Pays` VALUES (1,'France','FR');
INSERT INTO `Style` VALUES (1,'defaut'), (2,'gris'), (3,'vert'), (4,'bleu');
INSERT INTO `Authority` VALUES (1,'ROLE_USER');
INSERT INTO `Authority` VALUES (2,'ROLE_ADMIN');
INSERT INTO `Ficheutilisateur` VALUES (1,NULL,'1, rue de la mairie','rennes','35000');
INSERT INTO `Ficheutilisateur` VALUES (2,NULL,'2, rue de la mairie','rennes','35000');
INSERT INTO `Ficheutilisateur` VALUES (3,NULL,'3, rue de la mairie','rennes','35000');
INSERT INTO `Ficheutilisateur` VALUES (4,NULL,'4, rue de la mairie','rennes','35000');
INSERT INTO `Ficheutilisateur` VALUES (5,NULL,'5, rue de la mairie','rennes','35000');
INSERT INTO `Ficheutilisateur` VALUES (6,NULL,'6, rue de la mairie','rennes','35000');
INSERT INTO `Utilisateur` VALUES (1,1,1,'Lafosse','Jerome','jlafosse','jerome','jlafosse@simpleblog.fr','\images\aide.jpg','fr',1,1,1,1);
INSERT INTO `Utilisateur` VALUES (2,1,2,'Stapane','Amelie','astapane','amelie','astapane@simpleblog.fr','\images\aide.jpg','fr',1,1,1,1);
INSERT INTO `Utilisateur` VALUES (3,1,3,'Martin','Alain','amartin','alain','amartin@simpleblog.fr','\images\aide.jpg','en',1,1,1,1);
INSERT INTO `Utilisateur` VALUES (4,1,4,'Leroy','Pierre','pleroy','pierre','pleroy@simpleblog.fr','\images\aide.jpg','en',1,1,1,1);
INSERT INTO `Utilisateur` VALUES (5,1,5,'Abitbol','Georges','gabitbol','georges','gabitbol@simpleblog.fr','\images\aide.jpg','fr',1,1,1,1);
INSERT INTO `Utilisateur` VALUES (6,1,6,'Administrateur','Admin','admin','admin','admin@simpleblog.fr','\images\aide.jpg','fr',1,1,1,1);
INSERT INTO `Authority_Utilisateur` VALUES (1,1);
INSERT INTO `Authority_Utilisateur` VALUES (1,2);
INSERT INTO `Authority_Utilisateur` VALUES (1,3);
INSERT INTO `Authority_Utilisateur` VALUES (1,4);
INSERT INTO `Authority_Utilisateur` VALUES (1,5);
INSERT INTO `Authority_Utilisateur` VALUES (2,5);
INSERT INTO `Authority_Utilisateur` VALUES (1,6);
INSERT INTO `Authority_Utilisateur` VALUES (2,6);
INSERT INTO `Interet` VALUES (1,'Sport'), (2,'Politique'), (3,'Livres'), (4,'Informatique'), (5,'Jeux');
