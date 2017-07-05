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

	@Test(timeout = 60000)
	public void comparisonsComplete() {
		bigO.doComparisons();
	}
}
