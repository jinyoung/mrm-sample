package mrmsample.domain;

import java.util.*;
import lombok.*;
import mrmsample.domain.*;
import mrmsample.infra.AbstractEvent;

@Data
@ToString
public class PackingCompleted extends AbstractEvent {

    private Long id;
    private Long standardId;
    private Integer qty;
    private String status;

    public PackingCompleted(Packing aggregate) {
        super(aggregate);
    }

    public PackingCompleted() {
        super();
    }
}
