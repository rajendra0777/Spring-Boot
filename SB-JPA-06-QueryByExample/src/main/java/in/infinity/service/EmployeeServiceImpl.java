package in.infinity.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import in.infinity.entity.Employee;
import in.infinity.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl {

	private EmployeeRepository repository;

	public EmployeeServiceImpl(EmployeeRepository repository) {
		this.repository = repository;
	}

	public void customQuery() {
		Employee emp = new Employee();
		emp.setEname("Rakesh Sharma");
		emp.setEmail("sharma@gmail.com");

		Example<Employee> of = Example.of(emp);

		List<Employee> list = repository.findAll(of);
		list.forEach(e -> System.out.println(e));
	}
}

/*
 * 
 * Query By Example : Used to construct query dynamically. Used to implement
 * dynamic search functionality.
 * 
 * 
 */