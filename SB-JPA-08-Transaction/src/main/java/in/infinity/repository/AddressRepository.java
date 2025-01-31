package in.infinity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.infinity.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{

}
