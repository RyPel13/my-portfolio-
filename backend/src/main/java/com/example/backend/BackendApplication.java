// dev profile  →  H2 (in-memory, auto-starts with the app, no setup)
// prod profile →  PostgreSQL (PgAdmin manages this, needs a real DB created)

package com.example.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

}
