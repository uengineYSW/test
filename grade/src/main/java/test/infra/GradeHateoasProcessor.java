package test.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import test.domain.*;

@Component
public class GradeHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Grade>> {

    @Override
    public EntityModel<Grade> process(EntityModel<Grade> model) {
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "//grades/{id}")
                .withRel("/grades/{id}")
        );

        return model;
    }
}
