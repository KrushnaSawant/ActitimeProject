package com.Actitime.GenericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.Actitime.ObjectRepository.LoginPage;

public class Baseclass {
	
	public static WebDriver driver;
	FileLibrary f = new FileLibrary();
	
	@BeforeSuite
	public void databaseConnection() {
		Reporter.log("Database connected", true);
	}
	
	@BeforeClass
	public void launchBrowser() throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
		String URL = f.readDataFromProperty("url");
		driver.get(URL);
		Reporter.log("Browser is launched successfully", true);
	}
	
	@BeforeMethod
	public void login() throws IOException {
		String UN = f.readDataFromProperty("username");
		LoginPage lp = new LoginPage(driver);
		lp.getUntbx().sendKeys(UN);
		//driver.findElement(By.id("username")).sendKeys(UN);
		
		String PW = f.readDataFromProperty("password");
		lp.getPwtbx().sendKeys(PW);
		//driver.findElement(By.name("pwd")).sendKeys(PW);
		
		lp.getLgbtn().click();
		//driver.findElement(By.xpath("//div[.='Login ']")).click();
		Reporter.log("Logged in successfully", true);
	}
	
	@AfterMethod
	public void logout() {
		driver.findElement(By.id("logoutLink")).click();
		Reporter.log("Logged out successfully", true);
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
		Reporter.log("Browser closed successfully", true);
	}
	
	@AfterSuite
	public void databaseDisconnection() {
		Reporter.log("Database disconnected successfully", true);
	}
	
}
