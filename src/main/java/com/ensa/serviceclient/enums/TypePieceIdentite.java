package com.ensa.serviceclient.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TypePieceIdentite {
    CARTEIDENTITE("carte d'identité"),CERTIFICATMEDICAL("certificat médical")
    ,PASSPORT("Passport"),PERMISDECONDUITE("Permis de Conduite"),AUTRE("autre");
    private  String abrevation;
}
