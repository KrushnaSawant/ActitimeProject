package com.Actitime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
	//declaration
		@FindBy(xpath = "//div[.='Add New']")
		private WebElement AddNewTab;
		
		@FindBy(xpath = "//div[.='+ New Customer']")
		private WebElement NewCustomerTab;
		
		@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
		private WebElement CustomerNameTab;
		
		@FindBy(xpath = "(//textarea[@placeholder='Enter Customer Description'])")
		private WebElement CustomerDescriptionTab;
		
		@FindBy(xpath = "//div[.='Create Customer']")
		private WebElement CreateCustomerTab;
		
		@FindBy(xpath = "//div[@class='greyButton cancelBtn']")
		private WebElement CancelTab;
		
		//initialization
		public TaskPage(WebDriver d) {
			PageFactory.initElements(d, this);
		}

		//utilization
		public WebElement getAddNewTab() {
			return AddNewTab;
		}
		public WebElement getNewCustomerTab() {
			return NewCustomerTab;
		}
		public WebElement getCustomerNameTab() {
			return CustomerNameTab;
		}
		public WebElement getCustomerDescriptionTab() {
			return CustomerDescriptionTab;
		}
		public WebElement getCreateCustomerTab() {
			return CreateCustomerTab;
		}
		public WebElement getCancelTab() {
			return CancelTab;
		}
}
