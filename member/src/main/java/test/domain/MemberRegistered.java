package test.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import test.domain.*;
import test.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class MemberRegistered extends AbstractEvent {

    private String name;
    private Email email;
    private Address address;

    public MemberRegistered(Member aggregate) {
        super(aggregate);
    }

    public MemberRegistered() {
        super();
    }
}
//>>> DDD / Domain Event
