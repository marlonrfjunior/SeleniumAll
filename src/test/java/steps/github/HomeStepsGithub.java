package steps.github;

import pages.github.HomePageGithub;
import pages.github.SearchPageGithub;
import io.cucumber.java.pt.Quando;


public class HomeStepsGithub {


    @Quando("pesquiso o {string} com nome {string}")
    public void searchOnGit(String optionSearch, String valueSearch) {
        new HomePageGithub().searchOnGithub(valueSearch);
        new SearchPageGithub().searchOnGithub(optionSearch, valueSearch);
    }

}


