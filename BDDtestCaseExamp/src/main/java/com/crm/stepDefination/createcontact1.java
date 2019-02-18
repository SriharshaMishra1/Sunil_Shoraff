package com.crm.stepDefination;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class createcontact1 {
WebDriver driver;
@Given("^launch the Application$")
public void launch_the_Application() throws Throwable {
	System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\chrome.exe");
	System.setProperty("webdriver.gecko.driver", ".\\src\\test\\resources\\geckodriver.exe");
	driver=new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   driver.get("http://localhost:8888/");
}

@When("^login to application with valid \"(.*)\" and \"(.*)\"$")
public void login_to_application_with_valid_and(String username,String password) throws Throwable {
	driver.findElement(By.name("user_name")).sendKeys(username);
	   driver.findElement(By.name("user_password")).sendKeys(password);
	   driver.findElement(By.xpath("//input[@id='submitButton']")).click();   
}
		@Then("^home page should be display$")
	public void home_page_should_be_display() throws Throwable {
				  System.out.println(driver.getTitle());
	}

	@When("^click on contact Link$")
	public void click_on_contact_Link() throws Throwable {
		driver.findElement(By.linkText("Contacts")).click();;
	}

	@Then("^contact page should be display$")
	public void contact_page_should_be_display() throws Throwable {
	}

	@When("^click on create new contact page should be display$")
	public void click_on_create_new_contact_page_should_be_display() throws Throwable {
	  
	}

	@Then("^click on create new create contact page should be display$")
	public void click_on_create_new_create_contact_page_should_be_display() throws Throwable {
	    
	}

	@When("^create a contact$")
	public void create_a_contact() throws Throwable {
	    
	}

	@Then("^contact should be created$")
	public void contact_should_be_created() throws Throwable {
	  
	}

	@Then("^verify the successful msg$")
	public void verify_the_successful_msg() throws Throwable {
	 
	}

	@Then("^logout$")
	public void logout() throws Throwable {
	 
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	    
	}


}
