package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class ConfirmationPage extends BaseClass {
	public ConfirmationPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "order_no")
	private WebElement ConfirmationNumber;

	public WebElement getConfirmationNumber() {
		return ConfirmationNumber;
	}
	
	public void confirmation() {
		getValueByAttribute(getConfirmationNumber(), "value");
	}

}
