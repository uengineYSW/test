package test.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import test.domain.*;
import test.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class GradeDeleted extends AbstractEvent {

    private String name;
    private String subject;

    public GradeDeleted(Grade aggregate) {
        super(aggregate);
    }

    public GradeDeleted() {
        super();
    }
}
//>>> DDD / Domain Event
