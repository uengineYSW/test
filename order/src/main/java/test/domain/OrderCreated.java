package test.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import test.domain.*;
import test.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderCreated extends AbstractEvent {

    private String orderNumber;
    private Date orderDate;

    public OrderCreated(Order aggregate) {
        super(aggregate);
    }

    public OrderCreated() {
        super();
    }
}
//>>> DDD / Domain Event
