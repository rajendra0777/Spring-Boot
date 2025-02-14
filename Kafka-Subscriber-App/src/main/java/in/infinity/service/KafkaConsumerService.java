package in.infinity.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import in.infinity.model.Order;

@Service
public class KafkaConsumerService {

	@KafkaListener(topics = "order_topic", groupId = "order_group", containerFactory = "kafkaListenerFactory")
	public void consumeOrder(Order order) {
		System.out.println("✅ Kafka Order Received!");
		System.out.println("🛒 Order ID: " + order.getId());
		System.out.println("💲 Price: " + order.getPrice());
		System.out.println("📧 Email: " + order.getEmail());
		System.out.println("--------------------------------------------------");
	}
}
