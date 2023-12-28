package com.guru99bank.login;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TC01_CreateAccountAndLogin {
	WebDriver driver;
	String url = "https://demo.guru99.com/V4";
	String email, user, pass;
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  email = randomEmail();
  }

  @Test
  public void TC01_CreateAnAccount() {
	  System.out.println("Step 01 - Navigate to Login Page");
	  driver.get(url);
	  
	  System.out.println("Step 02 - Click Here");
	  driver.findElement(By.xpath("//a[text()='here'")).click();
	  driver.get("https://demo.guru99.com/");
	  
	  System.out.println("Step 03 - Enter Email");
	  driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys(email);
	  
	  System.out.println("Step 04 - Click Submit");
	  driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	  
	  System.out.println("Step 05 - Get User and Password");
	  user = driver.findElement(By.xpath("//td[text()='User ID :']/following-sibling::td")).getText();
	  pass = driver.findElement(By.xpath("//td[text()='Password :']/following-sibling::td")).getText();
  }
  
  @Test
  public void TC02_Login() {
	  System.out.println("Step 01 - Navigate to Login page");
	  driver.get(url);
	  
	  System.out.println("Step 02 - Enter User and Password");
	  driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(user);
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
	  
	  System.out.println("Step 03 - Click Login");
	  driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	  
	  System.out.println("Step 04 - Verify Home is displayed");
	  Assert.assertTrue(driver.findElement(By.xpath("//marquee[text()=\"Welcom to Manager's Page of Guru99 Bank\"]")).isDisplayed());
	  Assert.assertTrue(driver.findElement(By.xpath("//td[text()='Manager Id : " + user + "']")).isDisplayed());
  }
  String name = "\"Class 1023L1\"";
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }
  
  public String randomEmail(){
	  Random random = new Random();
	  int number = random.nextInt(99999);
	  String randomEmail = "automation" + number + "@gmail.com";
	  return randomEmail;
  }

}
