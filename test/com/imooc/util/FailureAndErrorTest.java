package com.imooc.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class FailureAndErrorTest {

	@Test
	public void testAdd() {
		assertEquals(6, new Calculator().add(3, 4));
	}
	
	@Test
	public void testDivide() {
		assertEquals(6, new Calculator().divide(3, 0));
	}

}
