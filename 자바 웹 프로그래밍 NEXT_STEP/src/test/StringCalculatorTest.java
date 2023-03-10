package test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import calculator.StringCalculator;

public class StringCalculatorTest {
	
	private StringCalculator sCal;
	
	@Before
	public void setup() {
		sCal = new StringCalculator();
	}
	
	@Test
	public void add_test() {
		assertEquals(1, sCal.add("1"));
		System.out.println("성공");
	}
	
	@Test
	public void add_쉼표구분자() {
		assertEquals(3, sCal.add("1,2"));
		System.out.println("성공");
	}
	
	@Test
	public void add_쉼표구분자_또는_콜론구분자() {
		assertEquals(6, sCal.add("1,2:3"));
		System.out.println("성공");
	}
	
	@Test
	public void add_커스텀구분자() {
		assertEquals(6, sCal.add("1,2:3"));
		System.out.println("성공");
	}
}
