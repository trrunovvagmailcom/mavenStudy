package study.mavenproject;

import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Level;
import java.util.logging.Logger;
@Log
@SpringBootApplication
public class MavenProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenProjectApplication.class, args);

		log.log(Level.INFO,"Wake up, Neo");
	}

}
