package com;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseTest {
	 private static final String alwaysRun = null;

	@Test(dataProvider = "dp")

  public void f(Integer n, String s) {
  }
  @BeforeMethod (groups="smoke")
  public void beforeMethod() {
	  System.out.println("BM");
  }

  @AfterMethod (alwaysRun=true) //againts every single annotation
  public void afterMethod(ITestResult r) {
	  switch (r.getStatus()) {
	 
	  }
	  
	  
	  System.out.println("AM");
  }


  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("BC");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AC");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("BT");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("AT");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BS");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("AS");
  }

}
