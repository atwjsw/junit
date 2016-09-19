package com.imooc.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		assertEquals(7, new Calculator().add(3, 4));
	}

	@Test
	public void testSub() {
		assertEquals(1, new Calculator().sub(5, 4));
	}

	@Test
	public void testMutiply() {
		assertEquals(12, new Calculator().multiply(3, 4));
	}

	@Test
	public void testDivide() {
		assertEquals(5, new Calculator().divide(15, 3));
	}

}
