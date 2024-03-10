package _8.Tests;


import org.junit.Test;

import _9.TestData.Errors;
import _9.TestData.Messages;

import org.junit.Assert;

public class LoginTest extends BaseTest {
	
	@Test
	public void authenticate() {
//		loginPage.enterUsername("catalyn98");
//		loginPage.enterPassword("Cat@lin1998");
//		loginPage.clickLogin();
		// loginPage.authenticate("catalyn98", "Cat@lin1998");
		
		// using method 1
		// loginPage.authenticate(user.getUsername(), user.getPassword());
		
		// using method 2
		loginPage.authenticate(user);
		
		Assert.assertEquals("catalyn98", profilePage.getUsername());
		Assert.assertEquals(Messages.PAGE_PROFILE_TITLE, profilePage.getPageTitle());
	}
	
	@Test
	public void loginWithInvalidUser() {
//		loginPage.enterUsername("catalyn98_wrong");
//		loginPage.enterPassword("Cat@lin1998");
//		loginPage.clickLogin();
		loginPage.authenticate("catalyn98_wrong", "Cat@lin1998");
		Assert.assertEquals(Messages.PAGE_LOGIN_TITLE, loginPage.getPageTitle());
		Assert.assertEquals(Errors.INVALID_USER_OR_PASS, loginPage.getLoginErrorMessage());
	}
}
