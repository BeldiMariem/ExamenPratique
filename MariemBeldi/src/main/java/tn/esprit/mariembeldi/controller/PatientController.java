package tn.esprit.mariembeldi.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.mariembeldi.entities.Patient;
import tn.esprit.mariembeldi.services.IPatientService;
@RestController
@AllArgsConstructor
public class PatientController {

    IPatientService ipatientService;

    @PostMapping("/add_patient")
    public void addPatient(@RequestBody Patient patient) {
        ipatientService.addPatient(patient);
    }
}
