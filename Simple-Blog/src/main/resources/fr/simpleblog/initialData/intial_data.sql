INSERT INTO style (id,nom) VALUES (1,'defaut'), (2,'gris'), (3,'vert'), (4,'bleu');
INSERT INTO authority (id,authority) VALUES (1,'ROLE_USER'), (2,'ROLE_ADMIN');
INSERT INTO ficheutilisateur (id,pays,adresse,ville,codepostal) VALUES (1,NULL,'1, rue de la mairie','rennes','35000'),
(2,NULL,'2, rue de la mairie','rennes','35000'), (3,NULL,'3, rue de la mairie','rennes','35000'),
(4,NULL,'4, rue de la mairie','rennes','35000'), (5,NULL,'5, rue de la mairie','rennes','35000'),
(6,NULL,'6, rue de la mairie','rennes','35000');
INSERT INTO utilisateur (id,style,ficheutilisateur,nom,prenom,username,password,
mail,avatar,langue,iscredentialsnonexpired,isaccountnonlocked,isaccountnonexpired,isenabled) 
VALUES (1,1,1,'Lafosse','Jerome','jlafosse','jerome','jlafosse@simpleblog.fr','\images\aide.jpg','fr',1,1,1,1),
(2,1,2,'Stapane','Amelie','astapane','amelie','astapane@simpleblog.fr','\images\aide.jpg','fr',1,1,1,1),
(3,1,3,'Martin','Alain','amartin','alain','amartin@simpleblog.fr','\images\aide.jpg','en',1,1,1,1),
(4,1,4,'Leroy','Pierre','pleroy','pierre','pleroy@simpleblog.fr','\images\aide.jpg','en',1,1,1,1),
(5,1,5,'Abitbol','Georges','gabitbol','georges','gabitbol@simpleblog.fr','\images\aide.jpg','fr',1,1,1,1),
(6,1,6,'Administrateur','Admin','admin','admin','admin@simpleblog.fr','\images\aide.jpg','fr',1,1,1,1);
INSERT INTO authority_Utilisateur (authority_id,utilisateur_id) VALUES (1,1), (1,2), (1,3), (1,4), (1,5), (2,5), (1,6), (2,6);
INSERT INTO interet (id,nom) VALUES (1,'Sport'), (2,'Politique'), (3,'Livres'), (4,'Informatique'), (5,'Jeux');