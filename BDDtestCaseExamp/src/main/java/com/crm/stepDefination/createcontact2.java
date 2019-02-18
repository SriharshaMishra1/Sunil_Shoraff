package com.crm.stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class createcontact2 {
	WebDriver driver;

	public class createcontact1 {
		
		WebDriver driver;
		@Given("^launch the Application$")
		public void launch_the_Application() throws Throwable {
			// System.setProperty("webdriver.chrome.driver", "./chrome.exe");
			 System.setProperty("webdriver.gecko.driver", ".\\src\\test\\resources\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://localhost:8888/");
		}

		@When("^login to application with valid \"(.*)\" and \"(.*)\"$")
		public void login_to_application_with_valid_and(String username, String password) throws Throwable {
			driver.findElement(By.name("user_name")).sendKeys(username);
			driver.findElement(By.name("user_password")).sendKeys(password);
			driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		}
		
		@Then("^home page should be displayed$")
		public void home_page_should_be_displayed() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@When("^click on contact link$")
		public void click_on_contact_link() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@Then("^contact page should be displayed$")
		public void contact_page_should_be_displayed() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@When("^click on create new contact page$")
		public void click_on_create_new_contact_page() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@Then("^create contact page should be displayed$")
		public void create_contact_page_should_be_displayed() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}






		

		
	}
}
