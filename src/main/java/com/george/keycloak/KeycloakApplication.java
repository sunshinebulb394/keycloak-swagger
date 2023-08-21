package com.george.keycloak;

import com.george.keycloak.entity.Students;
import com.george.keycloak.entity.StudentsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class KeycloakApplication {



	public static void main(String[] args) {
		SpringApplication.run(KeycloakApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner(DAO<StudentsModel> studentDao){
//		return args -> {
////			studentRepo.save(new Students(UUID.randomUUID(),"George Banin","Male",25));
//			studentDao.create(new StudentsModel(UUID.randomUUID(),"Banin Kwame","Male",25));
//		};
//	}
}
