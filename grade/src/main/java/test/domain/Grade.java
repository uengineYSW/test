package test.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import test.GradeApplication;
import test.domain.GradeCreated;
import test.domain.GradeDeleted;

@Entity
@Table(name = "Grade_table")
@Data
//<<< DDD / Aggregate Root
public class Grade {

    @Id
    private String name;

    private String subject;

    private Integer grade;

    @PostPersist
    public void onPostPersist() {
        GradeCreated gradeCreated = new GradeCreated(this);
        gradeCreated.publishAfterCommit();

        GradeDeleted gradeDeleted = new GradeDeleted(this);
        gradeDeleted.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static GradeRepository repository() {
        GradeRepository gradeRepository = GradeApplication.applicationContext.getBean(
            GradeRepository.class
        );
        return gradeRepository;
    }

    //<<< Clean Arch / Port Method
    public void updateGrade(UpdateGradeCommand updateGradeCommand) {
        //implement business logic here:

        GradeUpdated gradeUpdated = new GradeUpdated(this);
        gradeUpdated.publishAfterCommit();
    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
