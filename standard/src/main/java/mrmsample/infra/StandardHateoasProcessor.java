package mrmsample.infra;

import mrmsample.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class StandardHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Standard>> {

    @Override
    public EntityModel<Standard> process(EntityModel<Standard> model) {
        return model;
    }
}
