package test.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import test.GradeApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { GradeApplication.class })
public class CucumberSpingConfiguration {}
