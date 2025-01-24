package in.infinity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.infinity.service.EmployeeServiceImpl;

@SpringBootApplication
public class SbJpa05SortingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SbJpa05SortingApplication.class, args);
		EmployeeServiceImpl service = context.getBean(EmployeeServiceImpl.class);
		service.sortByName();
		//service.sortBySalary();
		//service.sortedByNameSalaryEmail();
	}

}
