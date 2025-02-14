package in.infinity.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import in.infinity.model.Order;

@Service
public class KafkaProducerService {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    private static final String TOPIC = "order_topic";

    public String sendOrder(Order order) {
        kafkaTemplate.send(TOPIC, order);
        return "✅ Order Sent: " + order;
    }
}
