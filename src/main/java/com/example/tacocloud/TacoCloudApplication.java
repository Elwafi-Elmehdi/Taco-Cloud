package com.example.tacocloud;

import com.example.tacocloud.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.security.crypto.password.PasswordEncoder;
//Applay profile to configuration class level to make it takes affect on all declared beans
//@Profile("dev")
@SpringBootApplication
public class TacoCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(TacoCloudApplication.class, args);
	}
//	@Bean
//	@Profile("dev")
//	@Profile({"dev","audit"})
//	@Profile({"!prod","!audit"})
//
//	public CommandLineRunner commandLineRunner(UserRepository userRepository, PasswordEncoder passwordEncoder){
//
//	}
}
