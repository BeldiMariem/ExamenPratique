package tn.esprit.mariembeldi.services;

import tn.esprit.mariembeldi.entities.Medecin;

public interface IMedecinService {
    public Medecin addMedecinAndAssignToClinique(Medecin medecin, Long cliniqueId);
}
