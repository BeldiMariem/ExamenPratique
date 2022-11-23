package tn.esprit.mariembeldi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.mariembeldi.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
