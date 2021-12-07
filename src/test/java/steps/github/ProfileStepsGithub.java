package com.marlonrfjunior.seleniumjunit.steps.github;

import com.marlonrfjunior.seleniumjunit.pages.github.ProfilePageGithub;
import io.cucumber.java.pt.Então;


public class ProfileStepsGithub {


    @Então("verifico a pagina do Usuário")
    public void verifyProfile() {
        new ProfilePageGithub().verification();
    }

}


