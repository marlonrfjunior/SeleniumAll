package com.marlonrfjunior.seleniumjunit.steps;

import io.cucumber.java.pt.Dado;

import static com.marlonrfjunior.seleniumjunit.core.WebDriverManager.*;

public class LoadStepSystems {

    @Dado("que acessei o site do linkedin")
    public  void loadLinkedin() {
        openBrowser();
        navigateToURLProperty("linkedin");
    }

    @Dado("que acessei o site do GitHub")
    public  void loadGitHub() {
        openBrowser();
        navigateToURLProperty("github");
    }
}
