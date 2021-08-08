package springKafka.springKafkadocker;


import org.apache.kafka.common.internals.Topic;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "seymakcakaya", groupId = "seymakcakaya_id")
    public void getMessage(Calculation calculation) {
        System.out.println("message:");
        System.out.println(calculation.toString());
    }


}
