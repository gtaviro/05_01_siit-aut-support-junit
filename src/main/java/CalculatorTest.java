
/**
 * This class test a numerical Calculator for the following Operations:
 * 
 *  ADD - +
 *  DIFFERENCE - -
 *  MULTIPLY - *
 *  SQRT
 *  DIVIDE - /
 * 
 * Author : Tanasa-Andrei Ioan
 * 
 */

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	// private static final char[] IllegalArgumentException = null;

	@Test
	public void testAdition() {

		Calculator calc = new Calculator();
		double result = calc.compute(4, 5, "+");
		Assert.assertEquals("Not expected result : 4 + 5 = 9", 9, result, 0);
		System.out.println("Add 2 positive numbers : " + result);
	}

	@Test
	public void testAditionOneNegativeNumber() {

		Calculator calc = new Calculator();
		double result = calc.compute(-4, 5, "+");
		Assert.assertEquals("Not expected result : (-4) + 5 = 1", 1, result, 0);
		System.out.println("Add 1 positive number with 1 negative number : " + result);
	}

	@Test
	public void testAditionTwoNegativeNumers() {

		Calculator calc = new Calculator();
		double result = calc.compute(-4, -5, "+");
		Assert.assertEquals("Not expected result : (-4) + (-5) = -9", -9, result, 0);
		System.out.println("Add 2 negative numbers : " + result);
	}

	@Test
	public void testDiff() {

		Calculator calc = new Calculator();
		double result = calc.compute(4, 5, "-");
		Assert.assertEquals("Not expected result : 4 - 5 = -1", -1, result, 0);
		System.out.println("Diff 2 positive numbers : " + result);
	}

	@Test
	public void testDiffOneNegativeNumber() {

		Calculator calc = new Calculator();
		double result = calc.compute(-4, 5, "-");
		Assert.assertEquals("Not expected result : (-4) - 5 = -9", -9, result, 0);
		System.out.println("Diff 1 positive number with 1 negative number : " + result);
	}

	@Test
	public void testDiffTwoNegativeNumers() {

		Calculator calc = new Calculator();
		double result = calc.compute(-4, -5, "-");
		Assert.assertEquals("Not expected result : (-4) - (-5) = 1", 1, result, 0);
		System.out.println("Diff 2 negative numbers : " + result);
	}

	@Test
	public void testMultiply() {

		Calculator calc = new Calculator();
		double result = calc.compute(4, 5, "*");
		Assert.assertEquals("Not expected result : 4 * 5 = 20", 20, result, 0);
		System.out.println("Multiply 2 positive numbers : " + result);
	}

	@Test
	public void testMultiplyOneNegativeNumber() {

		Calculator calc = new Calculator();
		double result = calc.compute(-4, 5, "*");
		Assert.assertEquals("Not expected result : 4 * (-5) = -20", -20, result, 0);
		System.out.println("Multiply 1 positive number with 1 negative number : " + result);
	}

	@Test
	public void testMultiplyTwoNegativeNumers() {

		Calculator calc = new Calculator();
		double result = calc.compute(-4, -5, "*");
		Assert.assertEquals("Not expected result : (-4) * (-5) = 20", 20, result, 0);
		System.out.println("Multiply 2 negative numbers : " + result);
	}

	@Test
	public void testMultiplyWithZero() {

		Calculator calc = new Calculator();
		double result = calc.compute(0, 5, "*");
		Assert.assertEquals("Not expected result : 0 * 5 = 0", 0, result, 0);
		System.out.println("Multiply with ZERO number : " + result);
	}

	@Test
	public void testDivide() {

		Calculator calc = new Calculator();
		double result = calc.compute(4, 5, "/");
		Assert.assertEquals("Not expected result : 4 / 5 = 0.8", .8, result, 0);
		System.out.println("Multiply 2 positive numbers : " + result);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDivideWithZero() {

		Calculator calc = new Calculator();
		double result = calc.compute(0, 5, "/");
		throw new IllegalArgumentException("Divide by ZERO" + result);

	}

	@Test
	public void testSqrt() {

		Calculator calc = new Calculator();
		double result = calc.compute(4, 5, "SQRT");
		Assert.assertEquals("Not expected result : math.sqrt(4) = 2", 2, result, 0);
		System.out.println("SQRT : " + result);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidOperator() {

		Calculator calc = new Calculator();
		double result = calc.compute(10, -5, "XXX");
		throw new IllegalArgumentException("UNSUPPORTED OPERATOR:" + "XXX" + result);

	}

}
