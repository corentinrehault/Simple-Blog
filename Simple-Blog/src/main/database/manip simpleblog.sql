#CONNECTION EN LIGNE DE COMMANDE

#mysql --user=user_name --password=password

#UTILISATEUR

SELECT * FROM Utilisateur;
SELECT * FROM Utilisateur WHERE Nom = 'toto';
DELETE from Utilisateur WHERE Nom = 'toto';
UPDATE Utilisateur SET Mail='jlafosse@simpleblog.fr',Password='jerome',Username='jlafosse',Prenom='jerome',Nom='lafosse' WHERE Username='jlafosse';
INSERT INTO Utilisateur (Nom,Prenom,Username,Password,Mail) VALUES('toto','tutu','toto','tutu','toto@impleblog.fr');

#PAYS

UPDATE Pays SET Id = '76', Nom = 'France', Codepays = 'FR' WHERE Id = '76';
INSERT INTO Pays VALUES ('76','France','FR');
DELETE FROM Pays WHERE Id = '76';
SELECT * FROM `pays`;
DELETE FROM `pays`;
SELECT * FROM pays WHERE nom='ALBANIA';

#STYLE

DELETE FROM `Style`;
UPDATE Style SET Id='1', Nom='Default' WHERE Id='1';
SELECT * FROM Style;

#FICHEUTILISATEUR

SELECT * FROM `FicheUtilisateur`;
SELECT * FROM `FicheUtilisateur` WHERE Id='1';
UPDATE FicheUtilisateur SET adresse='1, place de la mairie,ville=?',codepostal='35000',paysId=? WHERE Id='1';
DELETE FROM `FicheUtilisateur` WHERE Id='8';

#INTERET_FICHEUTILISATEUR

SELECT * FROM `Interet_FicheUtilisateur`;

#AUTHIORITY_UTILISATEUR

SELECT * FROM authority_utilisateur;
SELECT * FROM authority_utilisateur WHERE UtilisateurId_a_u='6';
SELECT * FROM authority INNER JOIN authority_utilisateur ON authority.id=authority_utilisateur.authorityId_a_u WHERE UtilisateurId_a_u='6';
INSERT INTO Authority_Utilisateur (AuthorityId_a_u,UtilisateurId_a_u) VALUES('1',LAST_INSERT_ID());