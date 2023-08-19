package com;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import db.DataDriven;

public class dbTest {
	
	@Test (dataProviderClass = DataDriven.class, dataProvider="login")

	public void f(Integer n, String s) {
		
		System.out.println(n);
		System.out.println(s);
		
	}
	
	
	
	


}
