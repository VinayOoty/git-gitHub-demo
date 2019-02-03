package com.qa.unit.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	
	@Test
	public void add(){
		System.out.println("ADD");
		int a = 10;
		int b = 20;
		Assert.assertEquals(30, a+b);
	}
	
	@Test
	public void sub(){
		System.out.println("SUB");
		int a = 10;
		int b = 20;
		Assert.assertEquals(10, b-a);
	}
	
	@Test
	public void multi(){
		System.out.println("MUL");
		int a = 10;
		int b = 20;
		Assert.assertEquals(200, a*b);
	}
	
	@Test
	public void div(){
		System.out.println("DIV");
		int a = 10;
		int b = 20;
		Assert.assertEquals(2, b/a);
	}
	
}
