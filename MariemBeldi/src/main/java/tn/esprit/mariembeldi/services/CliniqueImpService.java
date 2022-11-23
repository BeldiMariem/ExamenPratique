package tn.esprit.mariembeldi.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.mariembeldi.entities.Clinique;
import tn.esprit.mariembeldi.repository.CliniqueRepository;
@Service
@AllArgsConstructor
public class CliniqueImpService implements ICliniqueService {
   CliniqueRepository cliniqueRepository;
    @Override
    public Clinique addClinique(Clinique clinique) {
        return cliniqueRepository.save(clinique);
    }
}
