package com.Actitime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//declaration
	
@FindBy(xpath = "//div[.='Time-Track']")
private WebElement timeTrackTab;

@FindBy(xpath = "//div[.='Tasks']")
private WebElement taskTab;

@FindBy(xpath = "//div[.='Reports']")
private WebElement reportsTab;

@FindBy(xpath = "//div[.='Users']")
private WebElement userTab;

@FindBy(id = "logoutLink")
private WebElement logoutLink;

//initialization

public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getTimeTrackTab() {
	return timeTrackTab;
}

public WebElement getTaskTab() {
	return taskTab;
}

public WebElement getReportsTab() {
	return reportsTab;
}

public WebElement getUsertab() {
	return userTab;
}

public WebElement getLogoutLink() {
	return logoutLink;
}



}
