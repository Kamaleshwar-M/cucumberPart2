package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class SelectHotelPage extends BaseClass {
	
	public SelectHotelPage () {
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="radiobutton_0")
	private WebElement SelectRadioButton;
	
	@FindBy(name="continue")
	private WebElement ClickContinue;

	
	public WebElement getSelectRadioButton() {
		return SelectRadioButton;
	}

	public WebElement getClickContinue() {
		return ClickContinue;
	}
	
	public void selectHotel() {
		buttonClick(getSelectRadioButton());
		buttonClick(getClickContinue());
	}

}
