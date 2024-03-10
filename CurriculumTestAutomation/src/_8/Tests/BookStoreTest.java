package _8.Tests;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BookStoreTest extends BaseTest {
	
	@Before
	public void before() {
		super.before();
		loginPage.authenticate(user.getUsername(), user.getPassword());
		driver.get("https://demoqa.com/books");
	}
	
	@Test
	public void testBookSearch() {
		bookStorePage.enterSearchCriteria("JavaScript");
		List<String> titles = bookStorePage.getBookTitle();
		for(String title : titles) {
			Assert.assertTrue(title.contains("JavaScript"));
		}
	}
}
