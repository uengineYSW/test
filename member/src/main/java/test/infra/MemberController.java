package test.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.domain.*;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/members")
@Transactional
public class MemberController {

    @Autowired
    MemberRepository memberRepository;

    @RequestMapping(
        value = "members/{id}//members/{memberId}",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Member updateMember(
        @PathVariable(value = "id") String id,
        @RequestBody UpdateMemberCommand updateMemberCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /member/updateMember  called #####");
        Optional<Member> optionalMember = memberRepository.findById(id);

        optionalMember.orElseThrow(() -> new Exception("No Entity Found"));
        Member member = optionalMember.get();
        member.updateMember(updateMemberCommand);

        memberRepository.save(member);
        return member;
    }
}
//>>> Clean Arch / Inbound Adaptor
