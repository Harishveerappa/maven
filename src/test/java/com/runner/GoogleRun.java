package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\hveer\\eclipse-workspace\\Maven_Project\\src\\test\\java\\com\\feature\\Google.feature",
glue = "com.stepdefinition", 
plugin = {"html:Reports/Html_reporteer",
		"pretty","json:Reports/Reporter.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Reports/Extent_Report.html"})
public class GoogleRun {
	

}
