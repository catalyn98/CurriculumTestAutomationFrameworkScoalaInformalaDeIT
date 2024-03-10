package _8.Tests;

import java.time.Duration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import _7.Pages.BookStorePage;
import _7.Pages.LoginPage;
import _7.Pages.ProfilePage;
import _9.TestData.User;

public class BaseTest {
	static WebDriver driver;
	public static LoginPage loginPage;
	public static ProfilePage profilePage;
	public static BookStorePage bookStorePage;
	
	protected User user = new User("user");
	
	@BeforeClass
	public static void setUp() {

	}
	
	@AfterClass
	public static void tearDown() {

	}
	
	@Before
	public void before() {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		System.setProperty("webdriver.chrome.driver", "src/resource/chromedriver.exe");
		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		loginPage = new LoginPage(driver);
		profilePage = new ProfilePage(driver);
		bookStorePage = new BookStorePage(driver);
		driver.navigate().to("https://demoqa.com/login");
	}
	
	@After
	public void after() {
		driver.close();
	}
}
