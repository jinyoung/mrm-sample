package mrmsample.domain;

import java.util.*;
import lombok.Data;
import mrmsample.infra.AbstractEvent;

@Data
public class ProductProduced extends AbstractEvent {

    private Long id;
    private Long standardId;
    private Integer qty;
    private String status;
}
