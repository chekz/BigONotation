package test;

import org.junit.Before;
import org.junit.Test;

import BigONotation.BigONotation;

public class BigONotationTest {
	BigONotation bigO;

	@Before
	public void init() {
		bigO = new BigONotation();
	}

	@Test(timeout = 1000)
	public void nComparisonCompletes() {
		bigO.nComparison(5);
		System.out.println();
	}

	@Test(timeout = 1000)
	public void nSquaredComparisonCompletes() {
		bigO.nSquaredComparison(5);
		System.out.println();
	}
}
