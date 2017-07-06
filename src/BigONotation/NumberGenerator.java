package BigONotation;

import java.util.Random;

public class NumberGenerator {
	Random rand = new Random();
	
	public int[] generateRandomIntegers(int size) {
		int[] randomNumbers = new int[size];

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
	
	public int getRandomIntegerBetween(int min, int max) {
		return rand.nextInt(max - min) + min;
	}
}
