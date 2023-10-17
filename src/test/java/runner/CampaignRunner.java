package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/application_feature/Campaign.feature",
        glue = {"steps","hooks"},
//        publish = true,
        plugin = {"pretty"}
//        tags = "((@sanity or @functional) and not(@regression))"
//        dryRun = true

)
public class CampaignRunner extends AbstractTestNGCucumberTests {

}
