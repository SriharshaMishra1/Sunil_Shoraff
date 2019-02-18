package com.Products.genericlib;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import java.util.Properties;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Baseclass {
	public static WebDriver driver;
	public fileutils flib = new fileutils();

	
	public void configBc() throws Throwable {
		System.out.println("===============Launch Browser===============");
		Properties pobj = flib.getproperty();
		String browserName = pobj.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./resource/chrome.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.chrome.driver", "./Resource/firefox.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "./resource/iexplore.exe");

			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public void configBM() throws Throwable {
		System.out.println("login");
		Properties pobj = flib.getproperty();
		String URL1 = pobj.getProperty("url");
		driver.get(URL1);

		driver.findElement(By.name("user_name")).sendKeys(pobj.getProperty("username"));

		driver.findElement(By.name("user_password")).sendKeys(pobj.getProperty("password"));
		Thread.sleep(4000);

		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(2000);
		//driver.findElement(By.linkText("Products")).click();
	}

	
	public void configAM() {
		System.out.println("logout");
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();

	}
}
