package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://github.com/")
public class StartPage extends PageObject {
	
	@FindBy(linkText = "Sign in")
	private WebElement loginButton;

	public void goToLoginPage() {
		getDriver().manage().window().maximize();
		loginButton.click();
	}
}
