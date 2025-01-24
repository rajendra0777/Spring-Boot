package in.infinity.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import in.infinity.entity.Employee;
import in.infinity.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl {

	private EmployeeRepository repository;

	public EmployeeServiceImpl(EmployeeRepository repository) {
		this.repository = repository;
	}

	public void callPaginationMethod() {

		int pageSize = 5;
		int pageNumber = 5; // 0- For backend | 1 for UI 
		PageRequest pr = PageRequest.of(pageNumber, pageSize);

		Page<Employee> all = repository.findAll(pr);
		all.forEach(e -> System.out.println(e));
	}

}
