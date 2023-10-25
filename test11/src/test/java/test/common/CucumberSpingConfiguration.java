package test.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import test.Test11Application;

@CucumberContextConfiguration
@SpringBootTest(classes = { Test11Application.class })
public class CucumberSpingConfiguration {}
