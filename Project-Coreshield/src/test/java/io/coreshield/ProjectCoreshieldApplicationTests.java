package io.coreshield;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.apache.catalina.core.ApplicationContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProjectCoreshieldApplicationTests {

	@Autowired
	private ApplicationContext context;
	
	@Test
	void contextLoad() {
		assertNotNull(context, "Application context should have loaded successfully");
	}

}
