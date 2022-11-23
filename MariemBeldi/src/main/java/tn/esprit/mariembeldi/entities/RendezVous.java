package tn.esprit.mariembeldi.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RendezVous implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRDV;
    @Temporal(TemporalType.DATE)
    // @ApiModelProperty(required = true, dataType="date")
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date dateRdv;
    private String remarque;

    @ManyToOne
    private Medecin medecin;

    @ManyToOne
    private Patient patient;
}
