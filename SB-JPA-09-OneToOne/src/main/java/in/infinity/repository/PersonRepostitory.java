package in.infinity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.infinity.entity.Person;

public interface PersonRepostitory extends JpaRepository<Person, Integer>{

}
