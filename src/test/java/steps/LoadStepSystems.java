package steps;

import io.cucumber.java.pt.Dado;

import static core.WebDriverManager.*;

public class LoadStepSystems {

    @Dado("que acessei o site do linkedin")
    public void loadLinkedin() {
        openBrowser();
        navigateToURLProperty("linkedin");
    }

    @Dado("que acessei o site do GitHub")
    public void loadGitHub() {
        openBrowser();
        navigateToURLProperty("github");
    }
}
