package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class BookHotelPage extends BaseClass {

	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "first_name")
	private WebElement firstName;

	@FindBy(name = "last_name")
	private WebElement lastName;

	@FindBy(name = "address")
	private WebElement address;

	@FindBy(name = "cc_num")
	private WebElement creditCardNumber;

	@FindBy(id = "cc_type")
	private WebElement creditCardType;

	@FindBy(id = "cc_exp_month")
	private WebElement expiryMonth;

	@FindBy(id = "cc_exp_year")
	private WebElement expiryYear;

	@FindBy(name = "cc_cvv")
	private WebElement cvvNumber;

	@FindBy(name = "book_now")
	private WebElement BookNowButton;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditCardNumber() {
		return creditCardNumber;
	}

	public WebElement getCreditCardType() {
		return creditCardType;
	}

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public WebElement getCvvNumber() {
		return cvvNumber;
	}

	public WebElement getBookNowButton() {
		return BookNowButton;
	}

	public void bookNow(String firstName, String lastName, String billingAddress, String ccNum, String ccType, String expiryMonth, String expiryYear, String cvvNum ) {
		typeText(getFirstName(), firstName);
		typeText(getLastName(), lastName);
		typeText(getAddress(), billingAddress);
		typeText(getCreditCardNumber(), ccNum);
		typeText(getCreditCardType(), ccType);
		typeText(getExpiryMonth(), expiryMonth);
		typeText(getExpiryYear(),expiryYear);
		typeText(getCvvNumber(), cvvNum);
		buttonClick(getBookNowButton());
		
		
	}


}
