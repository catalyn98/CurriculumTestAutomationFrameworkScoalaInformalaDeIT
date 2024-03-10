package _7.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import _9.TestData.User;
// import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// locators
	private By usernameInput = By.id("userName");
	// WebElement usernameInput = driver.findElement(usernameInput);
	private By passwordInput = By.id("password");
	private By loginButton = By.id("login");
	private By loginErrorMessage = By.id("name");
	private By pageTitle = By.xpath("//div[@class=\"main-header\"]");
	
	public void enterUsername(String username) {
		// usernameInput.sendKeys(username);
		driver.findElement(usernameInput).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(passwordInput).sendKeys(password);
	}
	
	public void clickLogin() {
		driver.findElement(loginButton).click();
	}
	
	public String getLoginErrorMessage() {
		return driver.findElement(loginErrorMessage).getText();
	}
	
	public String getPageTitle() {
		return driver.findElement(pageTitle).getText();
	}
	
	// method 1
	public void authenticate(String username, String password) {
		enterUsername(username);
		enterPassword(password);
		clickLogin();
	}
	
	// method 2
	public void authenticate(User user) {
		enterUsername(user.getUsername());
		enterPassword(user.getPassword());
		clickLogin();
	}
}
