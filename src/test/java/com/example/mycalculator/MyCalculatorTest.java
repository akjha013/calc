package com.example.mycalculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class MyCalculatorTest {

	@Test
	void test() {
		//CalculatorController cc = new CalculatorController();
		CalculatorService cs = new CalculatorService();
		assertEquals(23.00,cs.add(8,15));
	}
}
