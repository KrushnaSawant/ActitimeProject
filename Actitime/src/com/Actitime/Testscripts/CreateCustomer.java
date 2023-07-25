package com.Actitime.Testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Actitime.GenericLibrary.Baseclass;
import com.Actitime.GenericLibrary.FileLibrary;
import com.Actitime.GenericLibrary.ListenerImplementation;
import com.Actitime.ObjectRepository.HomePage;
import com.Actitime.ObjectRepository.TaskPage;

@Listeners(ListenerImplementation.class)

public class CreateCustomer extends Baseclass {
	@Test
	public void createCustomer() throws EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(driver);
		hp.getTaskTab().click();
		TaskPage tp = new TaskPage(driver);
		tp.getAddNewTab().click();
		tp.getNewCustomerTab().click();
		FileLibrary fis = new FileLibrary();
		 String name = fis.readDataFromExcel("Sheet1", 3, 1);
		tp.getCustomerNameTab().sendKeys(name);
		
		String desc = fis.readDataFromExcel("Sheet1", 1, 2);
		tp.getCustomerDescriptionTab().sendKeys(desc);
		
		tp.getCreateCustomerTab().click();
	}
}
