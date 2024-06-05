package com.Reusable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Base.Base_Class;

public class Reusable_Class extends Base_Class {
	
	
	
	
	public static void ToClick(WebElement Element) {
		
		Element.click();

	}

	public static void EnterValue(WebElement Element, String value) {
		
		Element.sendKeys(value);		
		
	}
	
	
	
}
