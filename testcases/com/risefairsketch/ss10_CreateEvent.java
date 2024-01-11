package com.risefairsketch;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Risefairsketch.EventsPage;
import Risefairsketch.HomePage;
import Risefairsketch.LoginPage;
import commons.AbstractTest;

public class ss10_CreateEvent extends AbstractTest {
	WebDriver driver;

	@Parameters({ "browser" })
	@BeforeTest
	public void beforeTest(String browser) {
		driver = openMultiBrowsers(browser);
	}

	@Test
	public void TC01_CreateEvent() {
		loginPage = new LoginPage(driver);

		System.out.println("Step 01 - Login to application");
		loginPage.openLoginPage("https://rise.fairsketch.com/");
		loginPage.loginWithEmailAndPassword("client@demo.com", "riseDemo");
		
		homePage = new HomePage(driver);
		System.out.println("VP - Verify Login successfully");
		homePage.verifyHomePageIsDisplayed();

		System.out.println("Step 02 - Open page Events");
		homePage.selectMenu("events");
		
		eventsPage = new EventsPage(driver);
		System.out.println("Step 03 - Click [Add event]");
		eventsPage.clickAddEvent();
		
		System.out.println("Step 04 - Add a new event");
		eventsPage.inputInformation();
		
	}
	
	@AfterTest
	public void afterTest() {
		// driver.quit();
	}
	
	private LoginPage loginPage;
	private HomePage homePage;
	private EventsPage eventsPage;
}
