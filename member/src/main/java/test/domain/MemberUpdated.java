package test.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import test.domain.*;
import test.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class MemberUpdated extends AbstractEvent {

    private String memberId;
    private String name;
    private Email email;
    private Address address;

    public MemberUpdated(Member aggregate) {
        super(aggregate);
    }

    public MemberUpdated() {
        super();
    }
}
//>>> DDD / Domain Event
