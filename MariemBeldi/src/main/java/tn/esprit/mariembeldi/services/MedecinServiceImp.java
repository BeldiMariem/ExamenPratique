package tn.esprit.mariembeldi.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.mariembeldi.entities.Clinique;
import tn.esprit.mariembeldi.entities.Medecin;
import tn.esprit.mariembeldi.repository.CliniqueRepository;
import tn.esprit.mariembeldi.repository.MedecinRepository;

import javax.transaction.Transactional;
@Service
@AllArgsConstructor
public class MedecinServiceImp implements IMedecinService  {
    CliniqueRepository cliniqueRepository;
    MedecinRepository medecinRepository;

    @Override
    @Transactional
    public Medecin addMedecinAndAssignToClinique(Medecin medecin, Long cliniqueId) {
        Clinique clinique = cliniqueRepository.findById(cliniqueId).orElse(null);
        clinique.getMedecins().add(medecin);
        return medecinRepository.save(medecin);
    }
}
