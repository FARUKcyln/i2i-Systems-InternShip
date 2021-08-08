package springKafka.springKafkadocker;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.tags.Param;

@RestController
public class KafkaController {

    private final KafkaProducer producer;

    private  KafkaController(KafkaProducer producer){
    this.producer  =producer;
    }



    @PostMapping("/publish")
    public void  writeMessageToTopic( ){
        Calculation calculation = new Calculation();
        calculation.setOperand(15);
        calculation.setOperation("fib + prime");
        this.producer.writeMessage(calculation);
    }



}
