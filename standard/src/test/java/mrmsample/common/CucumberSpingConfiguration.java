package mrmsample.common;

import io.cucumber.spring.CucumberContextConfiguration;
import mrmsample.StandardApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { StandardApplication.class })
public class CucumberSpingConfiguration {}
