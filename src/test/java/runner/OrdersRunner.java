package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src\\test\\resources\\application_feature\\Orders.feature"},

        glue = {"steps", "hooks"},

        publish = true

)
public class OrdersRunner extends AbstractTestNGCucumberTests {
}
