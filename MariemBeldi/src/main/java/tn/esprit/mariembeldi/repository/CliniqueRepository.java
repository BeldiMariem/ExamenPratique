package tn.esprit.mariembeldi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.mariembeldi.entities.Clinique;

public interface CliniqueRepository extends JpaRepository<Clinique,Long> {
}
