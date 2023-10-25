package test.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class UpdateMemberCommand {

    private Email email;
    private Address address;
}
