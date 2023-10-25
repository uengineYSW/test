package test.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class CreateOrderCommand {

    private String orderNumber;
    private Date orderDate;
}
