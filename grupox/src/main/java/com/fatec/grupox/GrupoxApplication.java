package com.fatec.grupox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class GrupoxApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrupoxApplication.class, args);
		System.out.println(new BCryptPasswordEncoder().encode("123"));
	}

}
