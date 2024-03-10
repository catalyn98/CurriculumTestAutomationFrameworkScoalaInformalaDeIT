package _7.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage {
	WebDriver driver;
	
	public ProfilePage(WebDriver driver) {
		this.driver = driver;
	}
	
	// locators
	private By userNameLabel = By.id("userName-value");
	private By pageTitle = By.xpath("//div[@class=\"main-header\"]");
	
	// methods
	public String getUsername() {
		return driver.findElement(userNameLabel).getText();
	}
	
	public String getPageTitle() {
		return driver.findElement(pageTitle).getText();
	}

}
