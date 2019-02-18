package com.crm.stepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreaateOrganizations {
	WebDriver driver;


@Given("^Lunch the Application$")
public void lunch_the_Application() throws Throwable {
	driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://localhost:8888/");
}

@When("^login to application with valid username and password$")
public void login_to_application_with_valid_username_and_password(DataTable cred) throws Throwable {
	List<List<String>>data=cred.raw();
	driver.findElement(By.name("user_name")).sendKeys(data.get(0).get(0));
	driver.findElement(By.name("user_password")).sendKeys(data.get(0).get(1));
	 driver.findElement(By.id("submitButton")).click();
}

@Then("^Homepage Should be display$")
public void homepage_Should_be_display() throws Throwable {
	System.out.println("Homepage");
   
}

@When("^click on Organizations link$")
public void click_on_Organizations_link() throws Throwable {
	driver.findElement(By.linkText("Organizations") ).click();
}

@Then("^Organizations link should be display$")
public void organizations_link_should_be_display() throws Throwable {
    
}

@When("^click on  Create new Organizations page$")
public void click_on_Create_new_Organizations_page() throws Throwable {
   
}

@Then("^create Oganizations page should be display$")
public void create_Oganizations_page_should_be_display() throws Throwable {
    
}

@When("^create a Organisations$")
public void create_a_Organisations(DataTable arg1) throws Throwable {
   
}

@Then("^Organizations should be created$")
public void organizations_should_be_created() throws Throwable {
   
}

@Then("^verify he Organizations details$")
public void verify_he_Organizations_details() throws Throwable {
   
}

@Then("^verify the successful message$")
public void verify_the_successful_message() throws Throwable {
    
}

@Then("^close the Browser$")
public void close_the_Browser() throws Throwable {
    
}
	
	
}
