package com.ensa.serviceclient.repositories;

import com.ensa.serviceclient.enteties.Beneficiaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BeneficiaireRepo extends JpaRepository<Beneficiaire,Long> {
}
