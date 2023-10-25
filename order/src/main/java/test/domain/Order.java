package test.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import test.OrderApplication;
import test.domain.OrderCreated;

@Entity
@Table(name = "Order_table")
@Data
//<<< DDD / Aggregate Root
public class Order {

    @Id
    private String orderNumber;

    private Date orderDate;

    private String orderStatus;

    @PostPersist
    public void onPostPersist() {
        OrderCreated orderCreated = new OrderCreated(this);
        orderCreated.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static OrderRepository repository() {
        OrderRepository orderRepository = OrderApplication.applicationContext.getBean(
            OrderRepository.class
        );
        return orderRepository;
    }
}
//>>> DDD / Aggregate Root
