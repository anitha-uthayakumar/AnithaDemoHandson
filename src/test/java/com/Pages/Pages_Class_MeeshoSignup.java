package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base_Class;
import com.Reusable.Reusable_Class;

public class Pages_Class_MeeshoSignup extends Base_Class {
	
	public Pages_Class_MeeshoSignup(WebDriver driver) {
		
		this.driver = driver;
		
		
		PageFactory.initElements(driver,this);
		
		}
	
	@FindBy(xpath = "//span[text()='Cart']")
	WebElement clickcart;
	
	@FindBy(xpath = "//label[text()='Phone Number']")
	WebElement phno;
	
	@FindBy(xpath = "//span[text()='Continue']")
	WebElement cont;

	public WebElement getClickcart() {
		return clickcart;
	}

	public WebElement getPhno() {
		return phno;
	}

	public WebElement getCont() {
		return cont;
	}
}
