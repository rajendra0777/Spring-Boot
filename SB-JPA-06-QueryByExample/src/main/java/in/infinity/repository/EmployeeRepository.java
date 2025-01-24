package in.infinity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.infinity.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
