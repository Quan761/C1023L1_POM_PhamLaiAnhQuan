package Risefairsketch;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import Risefairsketch.HomePageInterface;

public class HomePage extends AbstractPage {
	WebDriver driver;

	public HomePage(WebDriver driver_) {
		driver = driver_;
	}

	public void clickTasks() {
		clickToElement(driver, HomePageInterface.TASKS);
	}
}
