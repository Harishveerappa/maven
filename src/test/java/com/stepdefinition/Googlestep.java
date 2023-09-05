package com.stepdefinition;

import com.base.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Googlestep extends BaseClass {
	
	@Given("^User Must Launch the\"([^\"]*)\" Browser$")
	public void user_Must_Launch_the_Browser(String arg1) throws Throwable {
		launchBrowser(arg1);

	}

	@When("^User Must Launch the \"([^\"]*)\" Url$")
	public void user_Must_Launch_the_Url(String arg1) throws Throwable {
		launchUrl(arg1);
	}



}
