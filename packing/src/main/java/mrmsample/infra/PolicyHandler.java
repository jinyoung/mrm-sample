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
    PackingRepository packingRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ProductProduced'"
    )
    public void wheneverProductProduced_PackingRequest(
        @Payload ProductProduced productProduced
    ) {
        ProductProduced event = productProduced;
        System.out.println(
            "\n\n##### listener PackingRequest : " + productProduced + "\n\n"
        );

        // Sample Logic //
        Packing.packingRequest(event);
    }
}
