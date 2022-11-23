package tn.esprit.mariembeldi.services;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.mariembeldi.entities.Medecin;
import tn.esprit.mariembeldi.entities.Patient;
import tn.esprit.mariembeldi.entities.RendezVous;
import tn.esprit.mariembeldi.entities.Specialite;
import tn.esprit.mariembeldi.repository.MedecinRepository;
import tn.esprit.mariembeldi.repository.PatientRepository;
import tn.esprit.mariembeldi.repository.RendezVousRepository;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class RendezVousServiceImp implements IRendezVousService {

    RendezVousRepository rdvRepository;

    MedecinRepository medecinRepository;

    PatientRepository patientRepository;
    @Override
    public void addRDVAndAssignMedAndPatient(RendezVous rdv, Long idMedecin, Long idPatient) {
        Medecin medecin = medecinRepository.findById(idMedecin).orElse(null);
        Patient patient = patientRepository.findById(idPatient).orElse(null);
        rdv.setMedecin(medecin);
        rdv.setPatient(patient);
        rdvRepository.save(rdv);
    }

    @Override
    public List<RendezVous> getRendezVousByCliniqueAndSpecialite(Long idClinique, Specialite specialite) {
        return rdvRepository.findByMedecinCliniquesIdCliniqueAndMedecinSpecialite(idClinique, specialite);
    }
    @Override
    public int getNbrRendezVousMedecin(Long idMedecin) {
        return rdvRepository.findByMedecinIdMedecin(idMedecin).size();
    }

    @Override
    public int getRevenuMedecin(Long idMedecin, Date startDate, Date endDate){
        return 0;
    }



}
