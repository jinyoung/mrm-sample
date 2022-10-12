package mrmsample.domain;

import java.util.*;
import lombok.*;
import mrmsample.domain.*;
import mrmsample.infra.AbstractEvent;

@Data
@ToString
public class ProductProduced extends AbstractEvent {

    private Long id;
    private Long standardId;
    private Integer qty;
    private String status;

    public ProductProduced(Production aggregate) {
        super(aggregate);
    }

    public ProductProduced() {
        super();
    }
}
