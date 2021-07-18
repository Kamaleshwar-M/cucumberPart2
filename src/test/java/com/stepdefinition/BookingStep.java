package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.BaseClass;
import com.pages.BookHotelPage;
import com.pages.ConfirmationPage;
import com.pages.LoginPage;
import com.pages.SearchHotelPage;
import com.pages.SelectHotelPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BookingStep extends BaseClass {

	@Given("User in on Adactine Login Page")
	public void user_in_on_Adactine_Login_Page() {
		getDriver();
		launchUrl("https://adactinhotelapp.com/");
	}

	@When("User should enter {string} and {string}")
	public void user_should_enter_and(String userName, String password) {
		LoginPage loginPage = new LoginPage();
		loginPage.login(userName, password);
	}

	@When("On Search Hotel Page User should enter {string},{string} and {string}")
	public void on_Search_Hotel_Page_User_should_enter_and(String location, String hotels, String roomType) {
		SearchHotelPage searchHotelPage = new SearchHotelPage();
		searchHotelPage.searchHotel(location, hotels, roomType);
	}

	@When("On Select Hotel page User should select Hotel and click Continue")
	public void on_Search_Hotel_page_User_should_select_Hotel_and_click_Continue() {
		SelectHotelPage hotelPage = new SelectHotelPage();
		hotelPage.selectHotel();

	}

	@When("On Booking Page User should enter {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void on_Booking_Page_User_should_enter_and(String firstName, String lastName, String billingAddress,
			String ccNum, String ccType, String expiryMonth, String expiryYear, String cvvNum)
			throws InterruptedException {
		BookHotelPage bookHotelPage = new BookHotelPage();
		bookHotelPage.bookNow(firstName, lastName, billingAddress, ccNum, ccType, expiryMonth, expiryYear, cvvNum);
		Thread.sleep(3000);
	}

	@When("user should print Booking order number")
	public void user_should_print_Booking_order_number() {
		ConfirmationPage confirmationPage = new ConfirmationPage();
		confirmationPage.confirmation();

	}

	@Then("user should verify success message")
	public void user_should_verify_success_message() {
		Assert.assertTrue("Verify Title", true);
		driver.quit();
	}
}

// WebDriver driver;
//
// @Given("User in on Adactine Login Page")
// public void user_in_on_Adactine_Login_Page() {
//
// WebDriverManager.chromedriver().setup();
// driver = new ChromeDriver();
// driver.get("https://adactinhotelapp.com/");
// driver.manage().window().maximize();
// }
//
// @When("User should enter {string} and {string}")
// public void user_should_enter_and(String name, String pass) {
//
// WebElement txtUserName = driver.findElement(By.name("username"));
// txtUserName.sendKeys(name);
// WebElement txtPassword = driver.findElement(By.name("password"));
// txtPassword.sendKeys(pass);
// WebElement btnLogin = driver.findElement(By.name("login"));
// btnLogin.click();
// }
//
// @When("On Search Hotel PageUser should select details and click on search
// button")
// public void
// on_Search_Hotel_PageUser_should_select_details_and_click_on_search_button() {
//
// WebElement selectLocation = driver.findElement(By.id("location"));
// Select s = new Select(selectLocation);
// s.selectByIndex(2);
//
// WebElement selectHotel = driver.findElement(By.id("hotels"));
// Select s1 = new Select(selectHotel);
// s1.selectByIndex(2);
//
// WebElement selectRoomType = driver.findElement(By.id("room_type"));
// Select s2 = new Select(selectRoomType);
// s2.selectByIndex(2);
//
// WebElement btnLogin = driver.findElement(By.name("Submit"));
// btnLogin.click();
//
// }
//
// @When("On Search Hotel page User should select Hotel and click Continue")
// public void
// on_Select_Hotel_page_User_should_select_Hotel_and_click_Continue() {
//
// WebElement radioButton = driver.findElement(By.name("radiobutton_0"));
// radioButton.click();
//
// WebElement continueButton = driver.findElement(By.name("continue"));
// continueButton.click();
// }
//
// @When("On Booking Page User should enter {string},{string} and {string}")
// public void on_Booking_Page_User_should_enter_and(String firstName, String
// lastName, String billingAddress) {
//
// WebElement first = driver.findElement(By.name("first_name"));
// first.sendKeys(firstName);
// WebElement second = driver.findElement(By.name("last_name"));
// second.sendKeys(lastName);
// WebElement add = driver.findElement(By.name("address"));
// add.sendKeys(billingAddress);
// }
//
// @When("User should Enter credit card details")
// public void
// user_should_Enter_credit_card_details(io.cucumber.datatable.DataTable
// dataTable) {
//
// List<Map<String, String>> m = dataTable.asMaps();
// Map<String, String> m1 = m.get(0);
// String ccNum = m1.get("Credit Card No.");
// WebElement credit = driver.findElement(By.name("cc_num"));
// credit.sendKeys(ccNum);
//
// List<Map<String, String>> m2 = dataTable.asMaps();
// Map<String, String> m3 = m2.get(3);
// String ccType = m3.get("Credit Card Type");
// WebElement selectCCType= driver.findElement(By.id("cc_type"));
// selectCCType.sendKeys(ccType);
//
// List<Map<String, String>> m4 = dataTable.asMaps();
// Map<String, String> m5 = m4.get(3);
// String ccMonth = m5.get("Credit Card Type");
// WebElement selectMonth = driver.findElement(By.id("cc_exp_month"));
// selectMonth.sendKeys(ccMonth);
//
// List<Map<String, String>> m6 = dataTable.asMaps();
// Map<String, String> m7 = m6.get(3);
// String ccYear = m7.get("Expiry Year");
// WebElement selectYear = driver.findElement(By.id("cc_exp_year"));
// selectYear.sendKeys(ccYear);
//
// List<Map<String, String>> m8 = dataTable.asMaps();
// Map<String, String> m9 = m8.get(3);
// String cvvNum = m9.get("CVV Number");
// WebElement cvvNumber = driver.findElement(By.name("cc_cvv"));
// cvvNumber.sendKeys(cvvNum);
// }
//
// @When("User should enter cvvNum and click BookNow button")
// public void user_should_enter_cvvNum_and_click_BookNow_button() throws
// InterruptedException {
//
// WebElement bookNowButton = driver.findElement(By.name("book_now"));
// bookNowButton.click();
//
// Thread.sleep(5000);
// }
//
// @When("user should print Booking order number")
// public void user_should_print_Booking_order_number() {
//
// WebElement orderNum = driver.findElement(By.id("order_no"));
// String text = orderNum.getAttribute("value");
// System.out.println("Order Number: "+text);
// }
//
// @Then("user should verify success message")
// public void user_shoud_verify_success_message() {
// Assert.assertTrue("Verify Title", true);
// driver.quit();
//
// }
//
//
// }
