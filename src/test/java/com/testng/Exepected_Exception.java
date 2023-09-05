package com.testng;

import org.junit.Test;

public class Exepected_Exception {
	@Test(expected= ArithmeticException.class)
private void demo() {
	int a=10;
	System.out.println(a/0);
	
}
}
