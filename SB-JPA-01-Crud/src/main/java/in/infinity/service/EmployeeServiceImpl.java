package in.infinity.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import in.infinity.entity.Employee;
import in.infinity.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl {

	private EmployeeRepository repository;

	public EmployeeServiceImpl(EmployeeRepository repository) {
		this.repository = repository;
	}

	public void saveAllEmployee() {

		Employee e1 = new Employee("John Doe", "john.doe@example.com", 55000.00, "+919876543210");
		Employee e2 = new Employee("Jane Smith", "jane.smith@example.com", 62000.00, "+918765432109");
		Employee e3 = new Employee("Robert Brown", "robert.brown@example.com", 48000.00, "+917654321098");
		Employee e4 = new Employee("Emily Davis", "emily.davis@example.com", 71000.00, "+916543210987");
		Employee e5 = new Employee("Michael Wilson", "michael.wilson@example.com", 54000.00, "+915432109876");
		Employee e6 = new Employee("Sarah Miller", "sarah.miller@example.com", 60000.00, "+914321098765");
		Employee e7 = new Employee("David Moore", "david.moore@example.com", 47000.00, "+913210987654");
		Employee e8 = new Employee("Laura Taylor", "laura.taylor@example.com", 58000.00, "+912109876543");
		Employee e9 = new Employee("James Anderson", "james.anderson@example.com", 65000.00, "+911098765432");
		Employee e10 = new Employee("Sophia Thomas", "sophia.thomas@example.com", 72000.00, "+919988776655");
		Employee e11 = new Employee("Daniel Jackson", "daniel.jackson@example.com", 56000.00, "+918877665544");
		Employee e12 = new Employee("Olivia White", "olivia.white@example.com", 63000.00, "+917766554433");
		Employee e13 = new Employee("Matthew Harris", "matthew.harris@example.com", 49000.00, "+916655443322");
		Employee e14 = new Employee("Isabella Martin", "isabella.martin@example.com", 70000.00, "+915544332211");
		Employee e15 = new Employee("Christopher Clark", "christopher.clark@example.com", 51000.00, "+914433221100");
		Employee e16 = new Employee("Ava Lewis", "ava.lewis@example.com", 67000.00, "+913322110099");
		Employee e17 = new Employee("Andrew Walker", "andrew.walker@example.com", 73000.00, "+912211009988");
		Employee e18 = new Employee("Mia Hall", "mia.hall@example.com", 58000.00, "+911100998877");
		Employee e19 = new Employee("Joshua Allen", "joshua.allen@example.com", 62000.00, "+919988777766");
		Employee e20 = new Employee("Amelia Young", "amelia.young@example.com", 49000.00, "+918877666655");
		Employee e21 = new Employee("Ryan King", "ryan.king@example.com", 55000.00, "+917766555544");
		Employee e22 = new Employee("Charlotte Wright", "charlotte.wright@example.com", 71000.00, "+916655444433");
		Employee e23 = new Employee("Benjamin Scott", "benjamin.scott@example.com", 52000.00, "+915544333322");
		Employee e24 = new Employee("Harper Adams", "harper.adams@example.com", 68000.00, "+914433222211");
		Employee e25 = new Employee("Samuel Nelson", "samuel.nelson@example.com", 74000.00, "+913322111100");
		Employee e26 = new Employee("Lily Baker", "lily.baker@example.com", 59000.00, "+912211000099");
		Employee e27 = new Employee("Anthony Carter", "anthony.carter@example.com", 53000.00, "+911100999888");
		Employee e28 = new Employee("Ella Perez", "ella.perez@example.com", 64000.00, "+919988778899");
		Employee e29 = new Employee("Alexander Roberts", "alexander.roberts@example.com", 75000.00, "+918877667788");
		Employee e30 = new Employee("Grace Turner", "grace.turner@example.com", 50000.00, "+917766556677");

		List<Employee> employees = Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16,
				e17, e18, e19, e20, e21, e22, e23, e24, e25, e26, e27, e28, e29, e30);

		List<Employee> saveAll = repository.saveAll(employees);

		saveAll.forEach(System.out::println);

	}

	public void getAllEmployees() {
		List<Employee> employees = repository.findAll();
		employees.forEach(e -> System.out.println(e));
	}

	public void getEmloyeeById(Integer eid) {
		Optional<Employee> employee = repository.findById(eid);
		if (employee.isPresent()) {
			Employee emp = employee.get();
			System.out.println(emp.toString());
		} else {
			System.out.println("Record does't not exist");
		}

	}

	// Update
	public void updateEmployee(Integer eid) {
		Optional<Employee> emp = repository.findById(eid);
		if (emp.isPresent()) {
			Employee e = emp.get();

			e.setEname("Rakesh Sharma");
			e.setEmail("sharma@gmail.com");
			e.setEsalary(26626.50);
			e.setEphone("9977886655");

			repository.save(e);
		} else {
			System.out.println("Record does't exist");
		}
	}

	public void deletEmplyeeById(Integer eid) {
		Optional<Employee> byId = repository.findById(eid);

		if (byId.isPresent()) {
			Employee employee = byId.get();
			repository.delete(employee);
			System.out.println("Recorde deleted");
		} else {
			System.out.println("Record does't exist");
		}

	}

}
