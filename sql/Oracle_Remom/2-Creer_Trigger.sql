-- sur la table ATTRIBUTION

CREATE OR REPLACE TRIGGER Trg_Attribution
BEFORE INSERT ON Attribution
FOR EACH ROW
BEGIN

	IF INSERTING THEN
			-- pour chaque ajout, on MAJ le Nb de Chambre dispo
		UPDATE ETABLISSEMENT
		SET Eta_NbChDispo = Eta_NbChDispo - :NEW.Att_NbChambres
		WHERE Eta_Id = :NEW.Att_Etablissement;
	END IF;

END;

-- sur la table Offre

CREATE OR REPLACE TRIGGER Trg_Offre
BEFORE INSERT ON Offre
FOR EACH ROW
BEGIN

	IF INSERTING THEN
			-- pour chaque ajout, on MAJ le Nb de Chambre dispo
		UPDATE ETABLISSEMENT
		SET Eta_NbChDispo = Eta_NbChDispo + :NEW.Off_NbChambres
		WHERE Eta_Id = :NEW.Off_Etablissement;
	END IF;

END;
