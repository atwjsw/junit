package com.imooc.util;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AnnotationTest {
	
	@Test(expected=ArithmeticException.class)
	public void testDivide() {
		assertEquals(5, new Calculator().divide(15, 0));
	}
	
	@Ignore
	@Test(timeout=2000)
	public void testWhile() {
		while(true) {
			System.out.println("run forever...");
		}		
	}
	
	@Test(timeout=3000)
	public void testReadFile() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
