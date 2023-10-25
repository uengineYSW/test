package test.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import test.domain.*;
import test.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class GradeCreated extends AbstractEvent {

    private String name;
    private String subject;
    private Integer grade;

    public GradeCreated(Grade aggregate) {
        super(aggregate);
    }

    public GradeCreated() {
        super();
    }
}
//>>> DDD / Domain Event
