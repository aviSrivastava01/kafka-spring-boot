package consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "my-topic", groupId = "my-group") // Match topic and group ID
    public void consume(String message) {
        System.out.println(String.format("#### -> Consumed message -> %s", message));
    }
}
