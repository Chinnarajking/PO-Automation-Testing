package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helpers.BaseClass;

public class loginPage extends BaseClass {

	public loginPage() {
    PageFactory.initElements(driver, this);
	}

	@FindBy(id = "details-button")
	private WebElement Advanced;

	@FindBy(id = "proceed-link")
	private WebElement Proceed;

	@FindBy(id = "login_email")
	private WebElement Username;

	@FindBy(id = "login_password")
	private WebElement Password;

	@FindBy(xpath = "//button[contains(text(),'Login')]")
	private WebElement Login;

	public WebElement getAdvanced() {
		return Advanced;
	}

	public WebElement getProceed() {
		return Proceed;
	}

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLogin() {
		return Login;
	}

	
	public void closebrowser() {
		driver.quit();
		
	}
}
