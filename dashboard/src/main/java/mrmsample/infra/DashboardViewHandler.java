package mrmsample.infra;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import mrmsample.config.kafka.KafkaProcessor;
import mrmsample.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class DashboardViewHandler {

    @Autowired
    private DashboardRepository dashboardRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenProductProduced_then_CREATE_1(
        @Payload ProductProduced productProduced
    ) {
        try {
            if (!productProduced.validate()) return;

            // view 객체 생성
            Dashboard dashboard = new Dashboard();
            // view 객체에 이벤트의 Value 를 set 함
            dashboard.setStandardId(productProduced.getStandardId());
            dashboard.setQty(productProduced.getQty());
            dashboard.setStatus(productProduced.getStatus());
            dashboard.setPackingQty(0);
            // view 레파지 토리에 save
            dashboardRepository.save(dashboard);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenPackingCompleted_then_UPDATE_1(
        @Payload PackingCompleted packingCompleted
    ) {
        try {
            if (!packingCompleted.validate()) return;
            // view 객체 조회

            List<Dashboard> dashboardList = dashboardRepository.findByStandardId(
                packingCompleted.getStandardId()
            );
            for (Dashboard dashboard : dashboardList) {
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                dashboard.setPackingQty(packingCompleted.getQty());
                dashboard.setStatus(packingCompleted.getStatus());
                // view 레파지 토리에 save
                dashboardRepository.save(dashboard);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
