package tn.esprit.mariembeldi.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.mariembeldi.entities.Clinique;
import tn.esprit.mariembeldi.services.ICliniqueService;

@RestController
@AllArgsConstructor
public class CliniqueController {
    ICliniqueService iServiceClinique;
    @PostMapping("/add_clinique")
    public Clinique addClinique (@RequestBody Clinique clinique) {
        return iServiceClinique.addClinique(clinique);
    }

}
