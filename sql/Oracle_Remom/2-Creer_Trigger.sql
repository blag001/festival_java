	-- sur la table ATTRIBUTION
CREATE TRIGGER Trg_Attribution
BEFORE INSERT ON ATTRIBUTION
FOR EACH ROW
BEGIN

	IF INSERTING THEN
			-- pour chaque ajout, on MAJ le Nb de Chambre dispo
		UPDATE ETABLISSEMENT
		SET Eta_NbChaDispo = Eta_NbChaDispo - :NEW.Att_NbChambres
		WHERE Eta_Id = :NEW.Att_Etablissement;
	END IF;

	COMMIT;
END;
