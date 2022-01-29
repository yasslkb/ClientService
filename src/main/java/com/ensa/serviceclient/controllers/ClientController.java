package com.ensa.serviceclient.controllers;

import com.ensa.serviceclient.enteties.Transfer;
import com.ensa.serviceclient.services.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(name = "/client")
@RequiredArgsConstructor
public class ClientController {
        private ClientService clientService;

        @GetMapping("/historique/{id}")
        ResponseEntity<Collection<Transfer>> getHistorique(@PathVariable Long id){
                return new ResponseEntity<>(clientService.getHistorique(id), HttpStatus.OK);
        }

        @PostMapping("/transfer")
                @ResponseStatus(HttpStatus.CREATED)
         void emisssionTransfert(@RequestBody Transfer transfer){
                clientService.emissionTransfert(transfer);
        }





}


