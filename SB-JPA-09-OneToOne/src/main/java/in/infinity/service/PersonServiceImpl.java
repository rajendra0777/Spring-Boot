package in.infinity.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.infinity.entity.Passport;
import in.infinity.entity.Person;
import in.infinity.repository.PassportRepository;
import in.infinity.repository.PersonRepostitory;

@Service
public class PersonServiceImpl {

	@Autowired
	private PersonRepostitory personRepo;

	@Autowired
	private PassportRepository passportRepo;

	public void savePersonWithPassport() {

		Person person = new Person();

		person.setFname("Lavkush");
		person.setLname("Prashad");

		Passport passport = new Passport();
		passport.setPnumber("G45ASD6KDH15");
		passport.setCreatedDate(LocalDate.now());
		passport.setExpiredate(LocalDate.now().plusYears(5));

		person.setPassport(passport);

		passport.setPerson(person);

		personRepo.save(person);
	}

}
