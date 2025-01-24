package in.infinity.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import in.infinity.entity.Employee;
import in.infinity.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl {

	private EmployeeRepository repository;

	public EmployeeServiceImpl(EmployeeRepository repository) {
		this.repository = repository;
	}

	public void sortByName() {
		Sort by = Sort.by("ename").ascending();
		List<Employee> list = repository.findAll(by);
		list.forEach(System.out::println);
	}

	public void sortBySalary() {
		Sort by = Sort.by("esalary").descending();
		List<Employee> list = repository.findAll(by);
		list.forEach(System.out::println);
	}

	public void sortedEmployee() {
		Sort sort = Sort.by("esalary", "ename");

		List<Employee> sorted = repository.findAll(sort);
		sorted.forEach(System.out::println);
	}

	public void sortedByNameSalaryEmail() {

		Sort by = Sort.by("ename", "esalary", "email");
		List<Employee> list = repository.findAll(by);
		list.forEach(System.out::println);

	}

}
