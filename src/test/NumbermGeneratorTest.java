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
	public void returnsCorrectCountOfRandomIntegers() {
		int[] numbers = numGenerator.generateRandomIntegers(5);
		int integerCount = numbers.length;

		assertEquals(5, integerCount);
	}
}
