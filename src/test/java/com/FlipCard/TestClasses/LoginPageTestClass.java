package com.FlipCard.TestClasses;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.FlipCard.POMClasses.LoginPagePOmClass;

public class LoginPageTestClass {
	
	@Test
	public void loginPageMethod() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yogesh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		LoginPagePOmClass userName=new LoginPagePOmClass(driver);
		userName.userName();
		
		userName.passWord();
		userName.loginBtn();
		
	}
	

}
