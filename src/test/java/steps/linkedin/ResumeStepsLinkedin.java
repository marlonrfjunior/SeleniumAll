package steps.linkedin;

import pages.linkedin.ResumePageLinkedin;
import io.cucumber.java.pt.Então;

public class ResumeStepsLinkedin {

    @Então("verifico o curriculo")
    public void resumeValidation() {
        new ResumePageLinkedin().verification();
    }
}
