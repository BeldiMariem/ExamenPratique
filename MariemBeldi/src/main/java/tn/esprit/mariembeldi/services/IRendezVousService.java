package tn.esprit.mariembeldi.services;

import tn.esprit.mariembeldi.entities.RendezVous;
import tn.esprit.mariembeldi.entities.Specialite;

import java.util.Date;
import java.util.List;

public interface IRendezVousService {
    public void addRDVAndAssignMedAndPatient(RendezVous rdv, Long idMedecin, Long idPatient);
    public List<RendezVous> getRendezVousByCliniqueAndSpecialite(Long idClinique, Specialite specialite);
    public int getNbrRendezVousMedecin(Long idMedecin);
    public int getRevenuMedecin(Long idMedecin, Date startDate, Date endDate);
}
