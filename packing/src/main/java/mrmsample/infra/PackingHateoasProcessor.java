package mrmsample.infra;

import mrmsample.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class PackingHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Packing>> {

    @Override
    public EntityModel<Packing> process(EntityModel<Packing> model) {
        return model;
    }
}
