package com.testng;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTest {
	@Test
private void Chrome() {
	WebDriverManager.chromedriver().setup();
	WebDriver d= new ChromeDriver();
	d.get("https://www.google.com/");
	System.out.println("Browser ID:" + Thread.currentThread().getId());
}
	@org.junit.Test
private void firefox() {
	WebDriverManager.firefoxdriver().setup();
	WebDriver d=new FirefoxDriver();
	d.get("https://www.google.com/");
	System.out.println("Browser ID :" + Thread.currentThread().getId());
}
	@Test
	private void edge() {
		WebDriverManager.edgedriver().setup();
	WebDriver d=new EdgeDriver();
	d.get("https://www.google.com/");
	System.out.println("Brower ID:" + Thread.currentThread().getId());
		
	}
}
