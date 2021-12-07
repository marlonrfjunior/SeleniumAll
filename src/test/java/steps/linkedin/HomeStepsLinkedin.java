package com.marlonrfjunior.seleniumjunit.steps.linkedin;

import com.marlonrfjunior.seleniumjunit.pages.linkedin.HomePageLinkedin;
import io.cucumber.java.pt.E;


public class HomeStepsLinkedin {


    @E("me direciono a página de procurar pessoas conhecidas")
    public void searchPeople() {
        new HomePageLinkedin().searchPeople();
    }

}


