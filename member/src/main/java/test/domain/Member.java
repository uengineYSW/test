package test.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import test.MemberApplication;
import test.domain.MemberCreated;
import test.domain.MemberDeleted;

@Entity
@Table(name = "Member_table")
@Data
//<<< DDD / Aggregate Root
public class Member {

    @Id
    private String name;

    private Email email;

    private Address address;

    @PostPersist
    public void onPostPersist() {
        MemberCreated memberCreated = new MemberCreated(this);
        memberCreated.publishAfterCommit();

        MemberDeleted memberDeleted = new MemberDeleted(this);
        memberDeleted.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static MemberRepository repository() {
        MemberRepository memberRepository = MemberApplication.applicationContext.getBean(
            MemberRepository.class
        );
        return memberRepository;
    }

    //<<< Clean Arch / Port Method
    public void updateMember(UpdateMemberCommand updateMemberCommand) {
        //implement business logic here:

        MemberUpdated memberUpdated = new MemberUpdated(this);
        memberUpdated.publishAfterCommit();
    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
