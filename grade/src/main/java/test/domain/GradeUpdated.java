package test.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import test.domain.*;
import test.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class GradeUpdated extends AbstractEvent {

    private String name;
    private String subject;
    private Integer grade;

    public GradeUpdated(Grade aggregate) {
        super(aggregate);
    }

    public GradeUpdated() {
        super();
    }
}
//>>> DDD / Domain Event
