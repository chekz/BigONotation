package BigONotation;

import java.util.Random;

public class NumberGenerator {
	public int[] generateRandomIntegers(int size) {
		int[] randomNumbers = new int[size];
		Random rand = new Random();

		for (int i = 0; i < size; i++) {
			randomNumbers[i] = rand.nextInt();
		}

		return randomNumbers;
	}
}
