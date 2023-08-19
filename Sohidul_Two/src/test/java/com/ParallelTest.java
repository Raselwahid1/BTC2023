package com;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParallelTest {
	
	WebDriver Driver;
	
	@Test
	public void test1 () {
		System.setProperty("webdriver.chrome.driver","/Users/russellwahid1/Desktop/"
				+ "BTC_JH230402M/chromedriver_mac64_111/chromedriver");
		
		Driver = new ChromeDriver ();
		Driver.get("https://www.facebook.com/");
	
		}
	
		
		
		
	
	
	@Test
	public void test2 () {
		
		
		
	}
	

}
