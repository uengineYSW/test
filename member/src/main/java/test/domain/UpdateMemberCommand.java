package test.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class UpdateMemberCommand {

    private String memberId;
    private String name;
    private Email email;
    private Address address;
}
