package in.infinity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.infinity.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

//	public List<Employee> sortedEmpBySalary();
//
//	public List<Employee> sortedEmpByName();
//
//	public List<Employee> sortedEmployeeByNameAndSalary();
//
//	public List<Employee> sortedEmployeesByNameSalaryAndEmail();

}
