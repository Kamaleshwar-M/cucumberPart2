package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class SearchHotelPage extends BaseClass {
	
	public SearchHotelPage () {
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="location")
	private WebElement txtLocation;
	
	@FindBy(id="hotels")
	private WebElement txtHotels;
	
	@FindBy(id="room_type")
	private WebElement txtRoomType;
	
	@FindBy(name="Submit")
	private WebElement clickSearch;

	
	public WebElement getTxtLocation() {
		return txtLocation;
	}

	
	public WebElement getTxtHotels() {
		return txtHotels;
	}

	
	public WebElement getTxtRoomType() {
		return txtRoomType;
	}

	
	public WebElement getClickSearch() {
		return clickSearch;
	}
	
public void searchHotel(String location, String hotels, String roomType) {
	selectOptionsByText(getTxtLocation(), location);
	selectOptionsByText(getTxtHotels(), hotels);
	selectOptionsByText(getTxtRoomType(), roomType);
	buttonClick(getClickSearch());

}


}
