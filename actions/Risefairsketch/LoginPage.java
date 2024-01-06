package Risefairsketch;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import Risefairsketch.LoginPageInterface;

public class LoginPage extends AbstractPage{
	WebDriver driver;

	public LoginPage(WebDriver driver_){
		driver = driver_;
	}
	
	public void openLoginPage(String url){
		openUrl(driver, url);
	}
	public void clickSignin() {
		clickToElement(driver, LoginPageInterface.BTN_SIGNIN);
	}
	
	public void enterEmail(){
		clear(driver, LoginPageInterface.TXB_EMAIl);
		sendkeyToElement(driver, LoginPageInterface.TXB_EMAIl, "admin@demo.com");
	}
	
	public void enterPassword(){
		clear(driver, LoginPageInterface.TXB_PASSWORD);
		sendkeyToElement(driver, LoginPageInterface.TXB_PASSWORD, "riseDemo");
	}
}
