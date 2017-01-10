package jbehave;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;
import steps.EndUserSteps;

public class DefinitionSteps {
	
    @Steps
    EndUserSteps endUser;

    @Given("the user '$username' with password '$password' is on main github page")
    public void givenTheUserIsOnTheGithubMainPage(String username, String password) {
        endUser.is_the_github_page(username, password);
    }

    @When("the user opens personal repository")
    public void whenTheUserOpensPersonalRepositories() {
        endUser.opens_personal_repositories();
    }

    @Then("amount of repositories should be printed")
    public void thenAmountOfRepositorieShouldBePrinted() {
        endUser.amount_of_repositories();
    }

}
