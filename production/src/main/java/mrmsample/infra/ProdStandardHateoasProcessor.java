package mrmsample.infra;

import mrmsample.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class ProdStandardHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<ProdStandard>> {

    @Override
    public EntityModel<ProdStandard> process(EntityModel<ProdStandard> model) {
        return model;
    }
}
