package com.testng;

import org.junit.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertConc {
	@Test
private void demo() {
	String exp = "Harish";
	String act = "Harish12";
	SoftAssert s= new SoftAssert();
	s.assertEquals(exp, act);
	System.out.println("verification");
}
}
