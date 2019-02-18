package com.crm.stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class createcontact {
	WebDriver driver;
	@Given("^launch the application$")
	public void launch_the_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\chrome.exe");
		System.setProperty("webdriver.gecko.driver", ".src\\test\\resources\\geckodriver.exe");
		driver=new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("^title of the login page should be displayed$")
	public void title_of_the_login_page_should_be_displayed() throws Throwable {
	   driver.get("http://localhost:8888/"); 
	   
	}

	@Then("^enter username/password$")
	public void enter_username_password() throws Throwable {
	   driver.findElement(By.name("user_name")).sendKeys("admin");
	   driver.findElement(By.name("user_password")).sendKeys("tiger");;
	  
	}

	@Then("^click on loginButton$")
	public void click_on_loginButton() throws Throwable {
    driver.findElement(By.id("submitButton")).click();

	}

	@Then("^verify home page$")
	public void verify_home_page() throws Throwable {
		driver.findElement(By.id("submitButton")).click();
	}

	@When("^navigate to contact page$")
	public void navigate_to_contact_page() throws Throwable {
	   
	}

	@Then("^verify contact page$")
	public void verify_contact_page() throws Throwable {
	   
	}



}
