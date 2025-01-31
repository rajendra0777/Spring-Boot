package in.infinity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.infinity.entity.Address;
import in.infinity.entity.Person;
import in.infinity.repository.AddressRepository;
import in.infinity.repository.PersonRepository;
import jakarta.transaction.Transactional;

@Service
public class PersonServiceImpl {

	@Autowired
	private PersonRepository pRepo;

	@Autowired
	private AddressRepository aRepo;

	
	@Transactional(rollbackOn = Exception.class)
	public void savePerson() {

		Person p = new Person();
		p.setName("Sanjay Singh");
		p.setEmail("sanjay@gmail.com");
		p.setPhone("5664655652");

		Person person = pRepo.save(p);

		//int i = 10/0;
		
		
		Address address = new Address();

		address.setCity("Bangalore");
		address.setState("Karnataka");
		address.setCountry("India");
		address.setPid(person.getPid());
		aRepo.save(address);

		
	}

}
