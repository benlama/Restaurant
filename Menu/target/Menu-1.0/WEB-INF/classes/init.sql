
INSERT INTO `utilisateur`(`TYPE`, `ID`, `DATE_NAISSANCE`, `EMAIL`, `ENABLED`, `NOM`, `PASSWORD`, `ADRESSE`, `PRENOM`, `TEL`, `USERNAME`, `PROFILE`,`PHOTO`) 
VALUES ('Utilisateur',1,'2014-01-01','Admin@gmail.com',true,'Admin','123456','Maroc','Admin','00 00 00 00 00','Admin','ADMINISTRATEUR','user.png');

-- --------------------------------------------------------

INSERT INTO `ROLE` (`ID`, `LIBELLE`) VALUES
(null, 'ROLE_ADMINISTRATEUR'),
(null, 'ROLE_MANAGER'),
(null, 'ROLE_SERVEUR'),
(null, 'ROLE_CLIENT');

-- --------------------------------------------------------

INSERT INTO `utilisateur_role`(`IDROLE`, `IDUTILISATEUR`) VALUES (1,1),(2,1),(3,1),(4,1);



INSERT INTO `cordonner`(`ID`, `latitude`, `longitude`, `zone`) VALUES (null,33,07,1),(null,34,06,1),(null,35,05,1),(null,36,04,1),(null,37,03,1),(null,38,02,1),(null,39,01,1);
