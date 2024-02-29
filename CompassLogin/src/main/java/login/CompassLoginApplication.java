package login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"login, signin"} )
public class CompassLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompassLoginApplication.class, args);
	}

}
