package mrmsample.common;

import io.cucumber.spring.CucumberContextConfiguration;
import mrmsample.PackingApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { PackingApplication.class })
public class CucumberSpingConfiguration {}
