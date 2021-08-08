package springKafka.springKafkadocker;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
private static  final  String TOPIC="seymakcakaya";

@Autowired
private KafkaTemplate<String, Calculation> kafkaTemplate;
//private KafkaTemplate<String, String> kafkaTemplate;


public  void writeMessage(Calculation calculation){
    this.kafkaTemplate.send(TOPIC, calculation);

}
@Bean
public NewTopic createTopic(){

    return new NewTopic(TOPIC,3,(short)1);
}

}
