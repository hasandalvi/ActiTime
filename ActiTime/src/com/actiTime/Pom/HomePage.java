package com.actiTime.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//declaration
	
	@FindBy(xpath = "//div[.='Tasks']")
	private WebElement tasktab;
	
	@FindBy(id = "logoutLink")
	private WebElement lgoutlink;
	
	//initilization
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public WebElement getTasktab() {
		return tasktab;	
	}
	
	public WebElement getLgoutlink() {
		return lgoutlink;
		
	}
	
	
	
	
	


}
