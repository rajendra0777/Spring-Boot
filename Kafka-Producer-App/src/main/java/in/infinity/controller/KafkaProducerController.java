package in.infinity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.infinity.model.Order;
import in.infinity.service.KafkaProducerService;

@RestController
@RequestMapping("/publish")
public class KafkaProducerController {

    @Autowired
    private KafkaProducerService producerService;

    @PostMapping("/order")
    public String publishOrder(@RequestBody Order order) {
        return producerService.sendOrder(order);
    }
}
