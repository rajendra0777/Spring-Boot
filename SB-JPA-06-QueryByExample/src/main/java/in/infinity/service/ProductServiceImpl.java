package in.infinity.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import in.infinity.entity.Product;
import in.infinity.repository.ProductRepository;

@Service
public class ProductServiceImpl {

	private ProductRepository repository;

	public ProductServiceImpl(ProductRepository repository) {
		this.repository = repository;
	}

	public void saveProduct() {
		Product p1 = new Product("Smartphone", 500.0, "Electronics");
		Product p2 = new Product("Laptop", 1200.0, "Electronics");
		Product p3 = new Product("Bluetooth Speaker", 150.0, "Electronics");
		Product p4 = new Product("Air Conditioner", 400.0, "Home Appliance");
		Product p5 = new Product("Refrigerator", 800.0, "Home Appliance");
		Product p6 = new Product("Running Shoes", 75.0, "Footwear");
		Product p7 = new Product("T-Shirt", 25.0, "Clothing");
		Product p8 = new Product("Washing Machine", 650.0, "Home Appliance");
		Product p9 = new Product("Gaming Console", 450.0, "Electronics");
		Product p10 = new Product("Microwave Oven", 200.0, "Home Appliance");

		List<Product> products = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
		repository.saveAll(products);
	}

	public void customQueryByQBE() {

		Product product = new Product();
		product.setCategory("Electronics");
		product.setName("phone");
		// keep other fields like above if required

		Example<Product> of = Example.of(product);

		List<Product> products = repository.findAll(of);
		products.forEach(System.out::println);

	}

}
