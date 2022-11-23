package tn.esprit.mariembeldi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.mariembeldi.entities.Medecin;

public interface MedecinRepository extends JpaRepository<Medecin, Long> {

}
