package mrmsample.domain;

import java.util.*;
import lombok.*;
import mrmsample.domain.*;
import mrmsample.infra.AbstractEvent;

@Data
@ToString
public class StandardChanged extends AbstractEvent {

    private Long id;
    private String prodName;
    private Long prodNum;

    public StandardChanged(Standard aggregate) {
        super(aggregate);
    }

    public StandardChanged() {
        super();
    }
}
