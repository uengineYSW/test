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
// @RequestMapping(value="/grades")
@Transactional
public class GradeController {

    @Autowired
    GradeRepository gradeRepository;

    @RequestMapping(
        value = "grades/{id}//grades/{id}",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Grade updateGrade(
        @PathVariable(value = "id") String id,
        @RequestBody UpdateGradeCommand updateGradeCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /grade/updateGrade  called #####");
        Optional<Grade> optionalGrade = gradeRepository.findById(id);

        optionalGrade.orElseThrow(() -> new Exception("No Entity Found"));
        Grade grade = optionalGrade.get();
        grade.updateGrade(updateGradeCommand);

        gradeRepository.save(grade);
        return grade;
    }
}
//>>> Clean Arch / Inbound Adaptor
