package in.infinity.service;

import org.springframework.stereotype.Service;

import in.infinity.entity.Employee;
import in.infinity.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl {

	private EmployeeRepository repository;

	public EmployeeServiceImpl(EmployeeRepository repository) {
		this.repository = repository;
	}
	
	
	public void callFindByMethod(String ename) {
		Employee emp = repository.findByEname(ename);
		System.out.println(emp.toString());
	}
	
}
