package org.test;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomer {

static WebDriver driver;
	@Given("The user is in add customer page")
	public void the_user_is_in_add_customer_page() {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajvir\\eclipse-workspace\\Se\\Driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/addcustomer.php");
	}

	@When("The user fill the customer details")
	public void the_user_fill_the_customer_details()  {
	    
	}

	@When("The user clicks submit button")
	public void the_user_clicks_submit_button() {
	    driver.findElement(By.name("submit")).click();
	    driver.switchTo().alert().accept();

	}

	@Then("The user should see the error message")
	public void the_user_should_see_the_error_message() {
		
		
		Assert.assertTrue(driver.findElement(By.tagName("h3")).isDisplayed());
		
	
	}


	
	
	
	
	
}
