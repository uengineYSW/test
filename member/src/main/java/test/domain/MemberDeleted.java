package test.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import test.domain.*;
import test.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class MemberDeleted extends AbstractEvent {

    private Email email;

    public MemberDeleted(Member aggregate) {
        super(aggregate);
    }

    public MemberDeleted() {
        super();
    }
}
//>>> DDD / Domain Event
