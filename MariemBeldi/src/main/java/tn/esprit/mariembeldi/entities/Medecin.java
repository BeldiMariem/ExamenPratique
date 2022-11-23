package tn.esprit.mariembeldi.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Medecin implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMedecin;
    private String nomMedecin;
    private int telephone;
    private int prixConsultation;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;

    @ManyToMany(mappedBy = "medecins")
    @JsonIgnore
    private Set<Clinique> cliniques;

    @OneToMany(mappedBy = "medecin")
    @JsonIgnore
    private Set<RendezVous> rdvs;
}