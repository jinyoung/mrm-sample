package mrmsample.common;

import io.cucumber.spring.CucumberContextConfiguration;
import mrmsample.ProductionApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { ProductionApplication.class })
public class CucumberSpingConfiguration {}
