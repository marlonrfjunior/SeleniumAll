package core;


import utils.Utils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.rules.TestWatcher;


import static core.WebDriverManager.*;

public class Hooks extends TestWatcher {

    public static Scenario scenario;

    public Hooks() {
        super();
    }

    @Before
    public void beforeScenario(Scenario scenario) {
        Utils.setEnvironment();
        Hooks.scenario = scenario;
    }

    @After
    public void afterScenario() {
        if (scenario.isFailed()) {
            if (getDriver() != null) {
                Throwable throwable = Utils.logError(scenario);
                String errorMessage = throwable.getMessage();
            }
        }
        closeAllBrowser();
    }


}
