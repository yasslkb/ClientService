package com.ensa.serviceclient.enteties;

import com.ensa.serviceclient.enums.Civilite;
import com.ensa.serviceclient.enums.Profession;
import com.ensa.serviceclient.enums.TypePieceIdentite;
import com.neovisionaries.i18n.CountryCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;

/*
* le client donneur d'ordre.
* identifier par sa piece d'identite.
* */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private Civilite titre;
    @NotBlank
    private String prenome;
    @Enumerated(EnumType.STRING)
    private TypePieceIdentite pieceIdentite;
    //paye d'emission
    @Enumerated(EnumType.STRING)
    private CountryCode payeEmissionCode;
    private Date dateExpirationPiece;
    private String numIdentite;
    private Date dateDeNaissance;
    @Enumerated(EnumType.STRING)
    private Profession profession;
    //paye de residance
    @Enumerated(EnumType.STRING)
    private CountryCode payeDeAdresse;
    //paye d'origin
    @Enumerated(EnumType.STRING)
    private CountryCode payeDeNationalite;
    private String adress;
    private String gsm;
    @Email
    private String email;
    //@OneToMany
   // @JoinColumn(name = "beneficiaire_id")
   // private List<Beneficiaire> beneficiaires;





}
