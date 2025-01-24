package in.infinity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.infinity.service.EmployeeServiceImpl;

@SpringBootApplication
public class SbJpa04PaginationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SbJpa04PaginationApplication.class, args);
		EmployeeServiceImpl service = context.getBean(EmployeeServiceImpl.class);
		service.callPaginationMethod();

	}

}
