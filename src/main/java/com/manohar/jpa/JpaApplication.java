package com.manohar.jpa;

import com.manohar.jpa.models.Author;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AuthorRepository repository) {
		return args -> {
			var author = Author.builder().firstName("Manoharr").lastName("Mittapally").age(26).email("manohar@gmail.com").build();
			repository.save(author);
		};
	}

}
