package in.infinity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.infinity.service.ProductServiceImpl;

@SpringBootApplication
public class SbJpa06QueryByExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SbJpa06QueryByExampleApplication.class, args);
		ProductServiceImpl service = context.getBean(ProductServiceImpl.class);
		//service.saveProduct();
		
		service.customQueryByQBE();
	}

}
