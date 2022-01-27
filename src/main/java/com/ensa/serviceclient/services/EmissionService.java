package com.ensa.serviceclient.services;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "emission-service", url = "http://localhost:8083/")
public interface EmissionService {

    // transfert.


}
