package tn.esprit.mariembeldi.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.mariembeldi.entities.Medecin;
import tn.esprit.mariembeldi.services.IMedecinService;

@RestController
@AllArgsConstructor
public class MedecinController {

    IMedecinService medecinService;

    @PostMapping("/add_medecin/{cliniqueId}")
    public Medecin addMedecinAndAssignToClinique(@RequestBody Medecin medecin, @PathVariable("cliniqueId") Long cliniqueId) {
        return medecinService.addMedecinAndAssignToClinique(medecin, cliniqueId);
    }
}
