package com.ensa.serviceclient.services;

import com.ensa.serviceclient.enteties.Transfer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Collection;

@FeignClient(name = "transfer-service" , url = "http://localhsot:8083/")
public interface TransfertService {

    //get historique d'un client.
    @GetMapping(path="/transfer/{id}")
     Collection<Transfer> getHistorique(@PathVariable(name = "id") Long id);

   //emission d'un transfert.
    @PostMapping(path = "/transfert/cheminverslamethodeffectuerletransfert")
    void emissionTransfert(@RequestBody Transfer transfer);

}
