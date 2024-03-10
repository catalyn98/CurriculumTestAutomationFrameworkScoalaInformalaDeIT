package _6.TestAutomationWithSelenium;

import java.util.List;
import java.util.Random;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MyFirstTest {
	static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		System.setProperty("webdriver.chrome.driver", "src/resource/chromedriver.exe");
		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public static void tearDown() {
		driver.close();
	}

	@Test @Ignore
	public void register() throws InterruptedException {
		Random random = new Random();
		int randomNumber = random.nextInt(10000);
		driver.navigate().to("https://demoqa.com/text-box");
		Thread.sleep(2000);
		
		WebElement usernameInput = driver.findElement(By.xpath("//input[@id=\"userName\"]"));
		WebElement emailInput = driver.findElement(By.id("userEmail"));
		WebElement currentAddressInput = driver.findElement(By.id("currentAddress"));
		WebElement permanentAddressInput = driver.findElement(By.id("permanentAddress"));
		WebElement submitButton = driver.findElement(By.id("submit"));
		// get coordinates for submitButton
		System.out.println("coordinated X: " + submitButton.getLocation().getX());
		System.out.println("coordinated Y: " + submitButton.getLocation().getY());
		
		String username = "random_user_" + randomNumber;
		String email = "random_user_" + randomNumber + "@gmail.com";
		String currentAddress = "Street Test, number " + randomNumber;
		String permanentAddress = "Street Automation, number " + randomNumber;
		
		usernameInput.sendKeys(username);
		Thread.sleep(3000);
		usernameInput.clear();
		Thread.sleep(3000);
		usernameInput.sendKeys("new user_" + username);
		emailInput.sendKeys(email);
		currentAddressInput.sendKeys(currentAddress);
		permanentAddressInput.sendKeys(permanentAddress);
		// scroll to the submit button
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(" + submitButton.getLocation().getX() + "," + submitButton.getLocation().getY() + ")");
		submitButton.click();
		
		WebElement usernameLabel = driver.findElement(By.id("name"));
		Assert.assertEquals("Name:" + "new user_" + username, usernameLabel.getText());
	}
	
	@Test @Ignore
	public void elementAttributes() {
		driver.navigate().to("https://demoqa.com/text-box");
		WebElement nameLabel = driver.findElement(By.id("userName-label"));
		// get text
		System.out.println("getText: " + nameLabel.getText());
		// get tag name
		System.out.println("getTagName: " + nameLabel.getTagName());
		// get location
		System.out.println("getLocation: " + nameLabel.getLocation());
		// get size
		System.out.println("getSize: " + nameLabel.getSize());
		// get attribute
		System.out.println("getAttribute: " + nameLabel.getAttribute("class"));
	}
	
	@Test @Ignore
	public void elementStates() {
		driver.navigate().to("https://demoqa.com/text-box");
		WebElement submitButton = driver.findElement(By.id("submit"));
		System.out.println("isDisplayed: " + submitButton.isDisplayed());
		System.out.println("isEnabled: " + submitButton.isEnabled());
		System.out.println("isEnabled: " + submitButton.isSelected());
	}
	
	@ Test @Ignore
	public void checkBoxes() {
		driver.navigate().to("https://demoqa.com/checkbox");
		WebElement mainToggle = driver.findElement(By.xpath("//ol/li[1]/span/button[@title=\"Toggle\"]"));
		mainToggle.click();
		WebElement homeFolder = driver.findElement(By.xpath("//span[contains(.,\"Home\")]/preceding-sibling::span[@class=\"rct-node-icon\"]/*"));
		Assert.assertTrue(homeFolder.getAttribute("class").contains("parent-open"));
		WebElement homeCheckbox = driver.findElement(By.xpath("//span[contains(.,\"Home\")]/preceding-sibling::span[@class=\"rct-checkbox\"]/*"));
		Assert.assertTrue(homeCheckbox.getAttribute("class").contains("-uncheck"));
	}
	
	@Test @Ignore
	public void radioButtons() {
		driver.navigate().to("https://demoqa.com/radio-button");
		WebElement yesRadio = driver.findElement(By.id("yesRadio"));
		WebElement noRadio = driver.findElement(By.id("noRadio"));
		System.out.println("isEnabled (yesRadio): " + yesRadio.isEnabled());
		System.out.println("isEnabled (noRadio): " + noRadio.isEnabled());
		WebElement yesRadioLabel = driver.findElement(By.xpath("//label[@for=\"yesRadio\"]"));
		yesRadioLabel.click();
		System.out.println("isSelected (yesRadio): " + yesRadio.isSelected());
	}
	
	@Test @Ignore
	public void alerts() {
		driver.get("https://demoqa.com/alerts");
		
		//simple alert
		WebElement alertButton = driver.findElement(By.id("alertButton"));
		alertButton.click();
		String alertMessage = driver.switchTo().alert().getText();
		Assert.assertEquals("You clicked a button", alertMessage);
		driver.switchTo().alert().accept();
		
        //prompt 
		WebElement promptButton = driver.findElement(By.id("promtButton"));
		promptButton.click();
		driver.switchTo().alert().sendKeys("10");
		driver.switchTo().alert().accept();
		WebElement promtResult = driver.findElement(By.id("promptResult"));
		Assert.assertEquals("You entered 10",promtResult.getText());
	}
	
	@Test @Ignore
	public void frames() {
		driver.get("https://demoqa.com/frames");
		driver.switchTo().frame("frame1");
		WebElement sample = driver.findElement(By.id("sampleHeading"));
		Assert.assertEquals("This is a sample page", sample.getText());
	}
	
	@Test @Ignore
	public void keyboardAction() {
		Random random = new Random();
		int randomNumber = random.nextInt(10000);
		String randomUsername = "random_user_" + randomNumber;
		driver.get("https://demoqa.com/text-box");
		WebElement username = driver.findElement(By.id("userName"));
		username.sendKeys(randomUsername);
		username.sendKeys(Keys.CONTROL+"A");
		username.sendKeys(Keys.DELETE);
	}
	
	@Test @Ignore
	public void dragAndDrop() throws InterruptedException {
		driver.get("https://demoqa.com/droppable");
		WebElement dragMe = driver.findElement(By.id("draggable"));
		WebElement dropMe = driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		action.dragAndDrop(dragMe, dropMe).build().perform();
		Thread.sleep(2000);
	}
	
	@Test
	public void tables() {
		driver.get("https://demoqa.com/webtables");
		String name = "Kierra";
		WebElement lastNameCell = driver.findElement(By.xpath("//div[@class=\"rt-tr-group\"][contains(., \""+name+"\")]/div/div[2]"));
		System.out.println(lastNameCell.getText() + "\n");

		// check all elements from a column
		List<WebElement> firstNames = driver.findElements(By.xpath("//div[@class=\"rt-tr-group\"]/descendant::div[@role=\"gridcell\"][1]"));
		for(WebElement firstName : firstNames) {
			System.out.println(firstName.getText());
		}
	}
}
