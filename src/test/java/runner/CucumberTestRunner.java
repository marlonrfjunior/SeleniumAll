package runner;


import utils.Utils;
import io.cucumber.java.Scenario;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Before;
import org.junit.runner.RunWith;

import java.io.File;


@RunWith(Cucumber.class)

@CucumberOptions(plugin = {"pretty"
        , "summary"
        , "json:target/report/cucumber-reports/Cucumber.json"
        , "html:target/report/cucumber-reports/cucumber.html"
        , "junit:target/report/cucumber-reports/cucumber.xml"
}

        , features = "src/test/resources/features"
        , tags = "@testGitHub"
        , glue = {"steps", "core"}
//                    ,dryRun = true
)
public class CucumberTestRunner {

    @Before
    public void beforeScenario(Scenario scenario) {
        new File("target/report/Screenshoots").mkdir();
        Utils.deleteAllFilesInFolder("target/report/Screenshoots");
    }
}
