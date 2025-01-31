package in.infinity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.infinity.service.PersonServiceImpl;

@SpringBootApplication
public class SbJpa09OneToManyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SbJpa09OneToManyApplication.class, args);
		PersonServiceImpl service = context.getBean(PersonServiceImpl.class);
		service.savePersonWithAddress();
	}

}
