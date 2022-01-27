package com.ensa.serviceclient.services.impl;

import com.ensa.serviceclient.enteties.Transfer;
import com.ensa.serviceclient.services.ClientService;
import com.ensa.serviceclient.services.TransfertService;
import lombok.RequiredArgsConstructor;

import java.util.Collection;

@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {
        private TransfertService transfertService;


    @Override
    public Collection<Transfer> getHistorique(Long id) {
            return transfertService.getHistorique(id);
    }

    @Override
    public void emissionTransfert(Transfer transferEmis) {
            transfertService.emissionTransfert(transferEmis);
    }
}
