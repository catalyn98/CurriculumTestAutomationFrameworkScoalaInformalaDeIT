package _7.Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookStorePage {
	WebDriver driver;
	
	public BookStorePage(WebDriver driver) {
		this.driver = driver;
	}
	
	// locators
	private By searchInput = By.id("searchBox");
	private By titleColumnCell = By.xpath("div[@role=\"rowgroup\"]//descendant::div[@role=\"gridcell\"][2]");
	
	// actions
	public void enterSearchCriteria(String word) {
		driver.findElement(searchInput).sendKeys(word);
	}
	
	public List<String> getBookTitle() {
		List<WebElement> titleElements = driver.findElements(titleColumnCell);
		List<String> titles = new ArrayList<String>();
		for(WebElement titleElement : titleElements) {
			// add each element from the table to the titles list
			if(!titleElement.getText().isEmpty()) {
				titles.add(titleElement.getText());
			}
		}
		return titles;
	}
}
