package test.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class RegisterMemberCommand {

    private String name;
    private Email email;
    private Address address;
}
