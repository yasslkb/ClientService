package com.ensa.serviceclient;

import com.ensa.serviceclient.enteties.Beneficiaire;
import com.ensa.serviceclient.enteties.Client;
import com.ensa.serviceclient.enums.Civilite;
import com.ensa.serviceclient.enums.Profession;
import com.ensa.serviceclient.enums.TypePieceIdentite;
import com.ensa.serviceclient.repositories.BeneficiaireRepo;
import com.ensa.serviceclient.repositories.ClientRepo;
import com.neovisionaries.i18n.CountryCode;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;


import java.util.Date;

@SpringBootApplication
@EnableFeignClients
public class ServiceClientApplication {

	public static void main(String[] args) {

		SpringApplication.run(ServiceClientApplication.class, args);
	}


	@Bean
	CommandLineRunner run(ClientRepo clientRepo,BeneficiaireRepo beneficiaireRepo){
			return  args -> {

				beneficiaireRepo.save(new Beneficiaire(1L,TypePieceIdentite.CARTEIDENTITE,"121212","0708976564",false));
				beneficiaireRepo.save(new Beneficiaire(2L,TypePieceIdentite.PASSPORT,"333333","0708976564",false));
				beneficiaireRepo.save(new Beneficiaire(3L,TypePieceIdentite.AUTRE,"444444","0708976564",true));

				beneficiaireRepo.findAll().forEach(beneficiaire -> {
					System.out.println(beneficiaire.toString()
					);
				});



				clientRepo.save(new Client(1L, Civilite.MONSIEUR,"yassine", TypePieceIdentite.CARTEIDENTITE, CountryCode.MA,
						new Date(),"123123",new Date(), Profession.ETUDIANT,CountryCode.MA,CountryCode.FR,"el ksiba","0608976564","lakbir743@gmail.com"
								//	beneficiaireRepo.findAll()
								)
						);
				clientRepo.save(new Client(2L, Civilite.MADAME,"khadija", TypePieceIdentite.PASSPORT, CountryCode.AL,
						new Date(),"898989",new Date(), Profession.ETUDIANT,CountryCode.MA,CountryCode.FR,"MArrakech","0709060302","khadija@gmail.com"
					//	beneficiaireRepo.findAll()
						));
						clientRepo.findAll().forEach(
								client -> {
										System.out.println(client.toString());
								}
						);

			};
	}
}
