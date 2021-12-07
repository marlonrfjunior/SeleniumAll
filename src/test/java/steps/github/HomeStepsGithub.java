package com.marlonrfjunior.seleniumjunit.steps.github;

import com.marlonrfjunior.seleniumjunit.pages.github.HomePageGithub;
import com.marlonrfjunior.seleniumjunit.pages.github.SearchPageGithub;
import com.marlonrfjunior.seleniumjunit.pages.linkedin.HomePageLinkedin;
import io.cucumber.java.pt.Quando;


public class HomeStepsGithub {



    @Quando("pesquiso o {string} com nome {string}")
    public void searchOnGit(String optionSearch, String valueSearch) {
        new HomePageGithub().searchOnGithub(valueSearch);
        new SearchPageGithub().searchOnGithub(optionSearch,valueSearch);
    }

}


