package mrmsample.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import mrmsample.ProductionApplication;
import mrmsample.domain.ProductProduced;

@Entity
@Table(name = "Production_table")
@Data
public class Production {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long standardId;

    private Integer qty;

    private String status;

    private String standardProdName;

    private String standardProdNum;

    @PostPersist
    public void onPostPersist() {
        ProductProduced productProduced = new ProductProduced(this);
        productProduced.publishAfterCommit();
    }

    public static ProductionRepository repository() {
        ProductionRepository productionRepository = ProductionApplication.applicationContext.getBean(
            ProductionRepository.class
        );
        return productionRepository;
    }
}
