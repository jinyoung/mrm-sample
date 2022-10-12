package mrmsample.domain;

import java.util.*;
import lombok.*;
import mrmsample.domain.*;
import mrmsample.infra.AbstractEvent;

@Data
@ToString
public class StandardRegistered extends AbstractEvent {

    private Long id;
    private String prodName;
    private Long prodNum;

    public StandardRegistered(Standard aggregate) {
        super(aggregate);
    }

    public StandardRegistered() {
        super();
    }
}
