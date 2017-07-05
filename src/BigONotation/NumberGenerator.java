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
	
	public int[] generateOrderedIntegers(int size) {
		int[] orderedIntegers = new int[size];
		
		for (int i = 0; i < size; i++) {
			orderedIntegers[i] = i + 1;
		}
		
		return orderedIntegers;
	}
}
