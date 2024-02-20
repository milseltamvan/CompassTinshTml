package addParty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("addParty")
public class CompassPartyApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompassPartyApplication.class, args);
	}

}
