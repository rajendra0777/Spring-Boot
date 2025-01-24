package in.infinity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.infinity.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	public Employee findByEname(String ename);
}

/*
 * FindByMethod is used to retrieve the records based on the non primary key
 * column value.
 * 
 * Used for only select operations.
 */