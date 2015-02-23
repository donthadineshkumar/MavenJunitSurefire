package com.test;

import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

public class FooTest {

	int unameLength = 20;
	
	@Test
	public void thisAlwaysPasses() {
	}

	@Test
	@Ignore
	/*
	 * Since junit4 you don't need to extend TestCase 
	 * 
	 * or any other class
	 * 
	 * you don't need to name your test cases - prefixing them with "test"
	 */
	public void thisIsIgnored() {
	}
	
	
	@Test
	public void checkNameLength(){
		String name ="Dinesh Dontha Kumar";
		
		assertTrue(name.length()>unameLength);
	}

}