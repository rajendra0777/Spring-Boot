package in.infinity.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.infinity.entity.Address;
import in.infinity.entity.Person;
import in.infinity.repository.AddressRepository;
import in.infinity.repository.PersonRepository;

@Service
public class PersonServiceImpl {

	@Autowired
	private PersonRepository personRepo;

	@Autowired
	private AddressRepository addressRepo;

	public void savePersonWithAddress() {

		Person p = new Person();

		p.setFname("Amar");
		p.setLname("Jeet");

		Address add1 = new Address();
		add1.setCity("Jaipur");
		
		add1.setState("Rajasthan");
		add1.setCountry("India");

		Address add2 = new Address();
		add2.setCity("Jabalpur");
		add2.setState("Madhya Pradesh");
		add2.setCountry("India");

		// association
		add1.setPerson(p);// setting parent to child
		add2.setPerson(p);

		
		List<Address> list = Arrays.asList(add1,add2);
		p.setAddresss(list);
		
		
		personRepo.save(p);

	}

}
