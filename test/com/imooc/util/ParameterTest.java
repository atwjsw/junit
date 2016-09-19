package com.imooc.util;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterTest {

	int expected = 0;
	int input1 = 0;
	int input2 = 0;

	@Parameters
	public static Collection<Object[]> test() {
		return Arrays.asList(new Object[][]{
			{4,2,2},
			{3,1,1},
			{7,2,5}		
		});
	}
	
	public ParameterTest(int expected, int input1, int input2) {
		this.expected = expected;
		this.input1 = input1;
		this.input2 = input2;		
	}
	
	@Test
	public void testAdd() {
		assertEquals(expected, new Calculator().add(input1, input2));
	}
}
