package com.ensa.serviceclient.services;


import com.ensa.serviceclient.enteties.Transfer;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public interface ClientService {

    //afficher tous l'historique d'un client.
    Collection<Transfer> getHistorique(Long id);
    void emissionTransfert(Transfer transferEmis);



}

