package com.crm.stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Products.genericlib.Baseclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class createProducts{
	
	Baseclass base = new Baseclass();

	@Given("^Launch the application$")
	public void launch_the_application() throws Throwable {

		base.configBc();

		System.out.println("Launch the application");
	}

	@When("^login to application with valid usename and password$")
	public void login_to_application_with_valid_usename_and_password() throws Throwable {
		base.configBM();
		System.out.println("login to application with valid usename and password");

	}

	@Then("^Homepage should be disaplay$")
	public void homepage_should_be_disaplay() throws Throwable {

		System.out.println("Homepage should be disaplay");
	}

	@When("^cilck on products link$")
	public void cilck_on_products_link() throws Throwable {

		//driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td[2]/table/tbody/tr/td[12]/a")).click();
		Thread.sleep(5000);
		WebElement wb=Baseclass.driver.findElement(By.xpath("//a[text()='Products']"));
		wb.click();
		System.out.println("cilck on products link");
	}

	@Then("^product page should be dispaly$")
	public void product_page_should_be_dispaly() throws Throwable {
		System.out.println("product page should be dispaly");
	}

	@When("^Click on create new product page$")
	public void click_on_create_new_product_page() throws Throwable {
		System.out.println("Click on create new product page");
	}

	@Then("^create product page should be display$")
	public void create_product_page_should_be_display() throws Throwable {
		System.out.println("create product page should be display");
	}

	@When("^Create a product$")
	public void create_a_product() throws Throwable {
		System.out.println("Create a product");
	}

	@Then("^product should be created$")
	public void product_should_be_created() throws Throwable {
		System.out.println("product should be created");
	}

	@Then("^Verify the product details$")
	public void verify_the_product_details() throws Throwable {
		;
	}

	@Then("^Verify the succesful message$")
	public void verify_the_succesful_message() throws Throwable {

	}

	@Then("^Logout$")
	public void logout() throws Throwable {

	}

}
