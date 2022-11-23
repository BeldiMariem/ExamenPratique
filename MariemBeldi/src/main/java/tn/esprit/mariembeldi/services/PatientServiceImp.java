package tn.esprit.mariembeldi.services;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.mariembeldi.entities.Patient;
import tn.esprit.mariembeldi.repository.PatientRepository;

@Service
@AllArgsConstructor
public class PatientServiceImp implements IPatientService {


    PatientRepository patientRepository;

    @Override
    public void addPatient(Patient patient) {
        patientRepository.save(patient);
    }
}