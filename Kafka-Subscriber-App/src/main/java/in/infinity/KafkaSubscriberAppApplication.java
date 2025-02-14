package in.infinity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import in.infinity.constants.KafkaConstants;

@SpringBootApplication
public class KafkaSubscriberAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaSubscriberAppApplication.class, args);
        System.out.println("✅ Kafka Subscriber App is Running...");

			
	}

	

}
