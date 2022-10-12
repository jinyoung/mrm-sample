package mrmsample.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import mrmsample.config.kafka.KafkaProcessor;
import mrmsample.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PolicyHandler {

    @Autowired
    ProductionRepository productionRepository;

    @Autowired
    ProdStandardRepository prodStandardRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='StandardRegistered'"
    )
    public void wheneverStandardRegistered_StandardRegist(
        @Payload StandardRegistered standardRegistered
    ) {
        StandardRegistered event = standardRegistered;
        System.out.println(
            "\n\n##### listener StandardRegist : " + standardRegistered + "\n\n"
        );

        // Sample Logic //
        ProdStandard.standardRegist(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='StandardChanged'"
    )
    public void wheneverStandardChanged_StandardChange(
        @Payload StandardChanged standardChanged
    ) {
        StandardChanged event = standardChanged;
        System.out.println(
            "\n\n##### listener StandardChange : " + standardChanged + "\n\n"
        );

        // Sample Logic //
        ProdStandard.standardChange(event);
    }
}
