package com.StepDefinition;

import org.openqa.selenium.remote.UnreachableBrowserException;

import com.Base.Base_Class;
import com.Pages.Pages_Class_MeeshoSignup;
import com.Reusable.Reusable_Class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Steps_Class_MeeshoSignup extends Reusable_Class {
	

	
	public static Pages_Class_MeeshoSignup pg;
	
	@Given("To Launch Meesho Application")
	public void to_launch_meesho_application() {
		BrowserLaunch();
		pg = new Pages_Class_MeeshoSignup(driver);
	}

	@When("To click Cart option")
	public void to_click_cart_option() {
	
		
		
		
		ToClick(pg.getClickcart());
	}

	@When("To click Mob No field")
	public void to_to_click_mob_no_field() {
		ToClick(pg.getPhno());
	}

	@When("To enter valid mobile number")
	public void to_enter_valid_mobile_number() {
		
		EnterValue(pg.getPhno(), "7904882133");
		
		}

	@When("To click Continue")
	public void to_click_continue() {
		
		ToClick(pg.getCont());
	}




}
