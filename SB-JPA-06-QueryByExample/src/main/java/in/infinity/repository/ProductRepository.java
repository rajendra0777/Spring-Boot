package in.infinity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.infinity.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
