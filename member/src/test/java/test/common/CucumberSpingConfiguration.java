package test.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import test.MemberApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { MemberApplication.class })
public class CucumberSpingConfiguration {}
