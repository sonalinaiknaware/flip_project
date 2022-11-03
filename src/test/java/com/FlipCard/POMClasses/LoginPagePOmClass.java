package com.FlipCard.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPagePOmClass {

	WebDriver driver;
	
		@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']") 
		WebElement name;
		public void userName() {
			name.sendKeys("9975852574");
		}
		
		@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
		WebElement password;
		
		public void passWord() {
			password.sendKeys("June@108");
		}
		
		@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
		WebElement loginBtn;
		
		public void loginBtn() {
			loginBtn.click();
			
		}
			public LoginPagePOmClass(WebDriver driver) {
				this.driver=driver;
				PageFactory.initElements(driver, this);
			}
		}
		
	 

