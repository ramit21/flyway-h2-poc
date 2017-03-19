package com.flyway.poc;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.flyway.poc.jpa.ReservationRepository;
import com.flyway.poc.model.Reservation;

@SpringBootApplication
public class FlywayPocApplication {
	
	private static Logger logger = Logger.getLogger(FlywayPocApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FlywayPocApplication.class, args);
		logger.debug("## FlywayPocApplication is up and running"); //logging must be set to debug to see the logs
	}
	
	@Bean
	CommandLineRunner runner(final ReservationRepository repo) {
		return new CommandLineRunner() {
			@Override
			public void run(String... strings) throws Exception {
				List<Reservation> reservations = repo.findAll();
				for (Reservation reservation : reservations) {
					logger.info(reservation);
				}
			}
		};
	}
}
