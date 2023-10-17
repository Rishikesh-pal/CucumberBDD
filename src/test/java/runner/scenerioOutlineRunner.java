package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/application_feature/ScenerioOutline.feature",
        glue = "steps",
        publish = true,
        plugin = {"pretty"}
)
public class scenerioOutlineRunner extends AbstractTestNGCucumberTests {

}
