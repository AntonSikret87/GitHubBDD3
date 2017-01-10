package steps;

import net.thucydides.core.annotations.Step;
import pages.LoginPage;
import pages.MainPage;
import pages.StartPage;

public class EndUserSteps {

	StartPage startPage;
	LoginPage loginPage;
	MainPage mainPage;

	@Step
	public void is_the_github_page(String username, String password) {
		startPage.open();
		startPage.goToLoginPage();
		loginPage.signIn(username, password);
		mainPage.goToYourProfile();
	}

	@Step
	public void opens_personal_repositories() {
		mainPage.goToYourRepositories();
	}

	@Step
	public void amount_of_repositories() {
		mainPage.printAmountOfRepositories();
	}

}
