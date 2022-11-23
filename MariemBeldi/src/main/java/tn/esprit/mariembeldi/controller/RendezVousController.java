package tn.esprit.mariembeldi.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.mariembeldi.entities.RendezVous;
import tn.esprit.mariembeldi.entities.Specialite;
import tn.esprit.mariembeldi.services.IRendezVousService;

import java.util.List;

@RestController
@AllArgsConstructor
public class RendezVousController {
    IRendezVousService irendezVousService;
    @PostMapping("/addRdvMedPatient/{idMed}/{idPat}")
    public void addRDVAndAssignMedAndPatient(@RequestBody RendezVous rdv, @PathVariable("idMed") Long idMedecin,
                                             @PathVariable("idPat") Long idPatient) {
        irendezVousService.addRDVAndAssignMedAndPatient(rdv, idMedecin, idPatient);
    }
    @GetMapping("/getRendezVousCliniqueSpecialite/{idClinique}/{specialite}")
    public List<RendezVous> getRendezVousByCliniqueAndSpecialite(@PathVariable("idClinique") Long idClinique, @PathVariable("specialite") Specialite specialite) {
        return irendezVousService.getRendezVousByCliniqueAndSpecialite(idClinique, specialite);
    }
    @GetMapping("/getNbrRendezVousMedecin/{idMedecin}")
    public int getNbrRendezVousMedecin(@PathVariable("idMedecin") Long idMedecin) {
        return irendezVousService.getNbrRendezVousMedecin(idMedecin);
    }


}
