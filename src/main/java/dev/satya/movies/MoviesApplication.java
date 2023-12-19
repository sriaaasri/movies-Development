package dev.satya.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoviesApplication {

	public static void main(String[] args) {
		System.out.println("testing");
		
		SpringApplication.run(MoviesApplication.class, args);
	}

}
