package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class LoginPage extends BaseClass {
	
		
		public LoginPage() {
		
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(name="username")
		private WebElement txtUserName;
		
		@FindBy(name="password")
		private WebElement txtPassword;
		
		@FindBy(name="login")
		private WebElement txtLogin;

		
		public WebElement getTxtUserName() {
			return txtUserName;
		}

		
		public WebElement getTxtPassword() {
			return txtPassword;
		}

		
		public WebElement getTxtLogin() {
			return txtLogin;
		}
		
		public void login(String userName, String password) {

			typeText(getTxtUserName(), userName);
			typeText(txtPassword, password);
			buttonClick(getTxtLogin());
		}
		
		}



