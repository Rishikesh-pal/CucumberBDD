package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/application_feature/ScenerioOutlineAssignment.feature"},
        glue = "steps",
        publish = true
)
public class ScenerioOutlineAssignmentRunner extends AbstractTestNGCucumberTests {
}
