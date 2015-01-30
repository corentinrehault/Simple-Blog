#UTILISATEUR

SELECT * FROM Utilisateur;
DELETE from Utilisateur where Nom = 'toto';
UPDATE Utilisateur SET Mail='jlafosse@simpleblog.fr',Password='jerome',Username='jlafosse',Prenom='jerome',Nom='lafosse' WHERE Username='jlafosse';

#PAYS

UPDATE Pays SET Id = '1', Nom = 'France', Codepays = 'FR' WHERE Id = '1';
INSERT INTO Pays VALUES ('1','France','FR');
DELETE FROM Pays WHERE Id = '1';
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

#INTERET_FICHEUTILISATEUR

SELECT * FROM `Interet_FicheUtilisateur`;