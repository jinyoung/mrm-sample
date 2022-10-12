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
}
