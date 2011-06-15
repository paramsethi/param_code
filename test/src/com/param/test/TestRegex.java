package com.param.test;

/**
 * Test regular expressions
 * 
 * @author parampreetsethi
 *
 */
public class TestRegex {

	public static void main(String[] args) {
		String test = "Ala||abcd||asbdc";
		String[] regexArr = test.split("\\|\\|");
		System.out.println(regexArr.length);
	}
}
