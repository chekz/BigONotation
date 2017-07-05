package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import BigONotation.NumberGenerator;

public class NumbermGeneratorTest {
	NumberGenerator numGenerator;

	@Before
	public void init() {
		numGenerator = new NumberGenerator();
	}

	@Test
	public void generateRandomIntegersReturnsCorrectNumberOfIntegers() {
		int[] nums = numGenerator.generateRandomIntegers(5);

		assertEquals(5, nums.length);
	}
	
	@Test
	public void generateOrderedIntegersReturnsCorrectNumberOfIntegers() {
		int[] nums = numGenerator.generateOrderedIntegers(5);
		assertEquals(5, nums.length);
	}
	
	@Test
	public void generateOrderedIntegersIncrementsBy1StartingAt1() {
		int[] nums = numGenerator.generateOrderedIntegers(5);
		
		for (int i = 0; i < nums.length; i++ ) {
			assertEquals(i + 1, nums[i]);
		}
	}
}
