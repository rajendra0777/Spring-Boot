package in.infinity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.infinity.service.PersonServiceImpl;

@SpringBootApplication
public class SbJpa07TransactionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SbJpa07TransactionApplication.class, args);
		PersonServiceImpl service = context.getBean(PersonServiceImpl.class);
		service.savePerson();
	}

}
