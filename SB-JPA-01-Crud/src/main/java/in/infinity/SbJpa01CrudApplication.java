package in.infinity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.infinity.entity.Employee;
import in.infinity.service.EmployeeServiceImpl;

@SpringBootApplication
public class SbJpa01CrudApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SbJpa01CrudApplication.class, args);
		EmployeeServiceImpl service = context.getBean(EmployeeServiceImpl.class);
	//	service.saveAllEmployee();

		//service.updateEmployee(1);
		//service.deletEmplyeeById(30);
	//	service.getEmloyeeById(5);
		
	}

}
