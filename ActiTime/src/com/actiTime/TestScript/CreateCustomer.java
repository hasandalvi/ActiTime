package com.actiTime.TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.actiTime.Genericliabrary.Baseclass;
import com.actiTime.Genericliabrary.FileLibrary;
import com.actiTime.Pom.HomePage;
import com.actiTime.Pom.TaskPage;

public class CreateCustomer extends Baseclass{

	@Test
	public void create() throws EncryptedDocumentException, IOException {
		HomePage hp=new HomePage(driver);
		hp.getTasktab().click();
		TaskPage tp=new TaskPage(driver);
		tp.getAddnew().click();
		tp.getNewcustomer().click();
	    FileLibrary f=new FileLibrary();
	    String custname = f.ReaddatafromExcel("Sheet1", 2, 1);
	    tp.getCustomername().sendKeys(custname);
	    String custdescp = f.ReaddatafromExcel("Sheet1", 2, 2);
	    tp.getCustdescp().sendKeys(custdescp);
	    tp.getCreatebtn().click();
	    
	}
}
