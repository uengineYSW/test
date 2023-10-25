package test.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class DeleteGradeCommand {

    private String name;
    private String subject;
}
