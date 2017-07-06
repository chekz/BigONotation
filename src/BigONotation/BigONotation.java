package BigONotation;

public class BigONotation {
	private NumberGenerator numGenerator;
	long startTime;
	long endTime;
	int dataSize;
	int iterations = 5;
	
	public void doComparisons() {
		numGenerator = new NumberGenerator();
		
		nComparison();
		nSquaredComparison();
		logNComparison();
	}

	private void nComparison() {
		System.out.println("ON Algorithm");
		dataSize = 10000000;

		for (int i = 0; i < iterations ; i++) {
			displayNDetails(dataSize);
			dataSize += dataSize;
		}

		System.out.println();
	}
	
	private void displayNDetails(int size) {
		int[] nums = numGenerator.generateRandomIntegers(size);
		
		startTime = System.currentTimeMillis();
		runNAlgorithm(nums);
		endTime = System.currentTimeMillis();

		printDetails(size, endTime - startTime);
	}
	
	private void runNAlgorithm(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			nums[i] += 1;
		}
	}
	
	private void printDetails(int size, long milliseconds) {
		System.out.println(size + " \t\t " + milliseconds);
	}

	private void nSquaredComparison() {
		System.out.println("ON^2 Algorithm");

		dataSize = 1000;

		for (int i = 0; i < iterations; i++) {
			displayNSquaredDetails(dataSize);
			dataSize += dataSize;
		}

		System.out.println();
	}

	private void displayNSquaredDetails(int size) {
		int[] nums = numGenerator.generateRandomIntegers(size);
		
		startTime = System.currentTimeMillis();
		runNSquaredAlgorithm(nums);
		endTime = System.currentTimeMillis();

		printDetails(size, endTime - startTime);
	}

	private void runNSquaredAlgorithm(int[] nums) {
		// This is bubble sort
		int tempHolder;
		
		for (int i = nums.length - 1; i > 1; i--) {
			for (int j = 0; j < i; j++) {
				if (nums[ j ] > nums[ j + 1 ]) {
					tempHolder = nums[ j ];
					nums[ j ] = nums[ j+1 ];
					nums[ j + 1 ] = tempHolder;
				}
			}
		}
	}
	
	private void logNComparison() {		
		System.out.println("log N Algorithm");
		
		dataSize = 10000000;
		
		for(int i = 0; i < 5; i++ ) {
			displayLogNDetails(dataSize);
			dataSize += dataSize;
		}
	}
	
	private void displayLogNDetails(int size) {
		int[] orderedIntegers = numGenerator.generateOrderedIntegers(size);
		int numToFind = numGenerator.getRandomIntegerBetween(orderedIntegers[0], orderedIntegers[orderedIntegers.length - 1]);
		
		startTime = System.currentTimeMillis();
		runLogNAlgorithm(orderedIntegers, numToFind);
		endTime = System.currentTimeMillis();

		printDetails(size, endTime - startTime);
	}
	
	private void runLogNAlgorithm(int[] orderedIntegers, int numToFind) {		
		// This is a binary search
		int firstIndex = 0;
		int endIndex = orderedIntegers.length - 1;
		int middleIndex;
		
		while(true) {
			middleIndex = (firstIndex  + endIndex) / 2;

			if (orderedIntegers[middleIndex] == numToFind) {
				// Found number
				break;
			} else if (firstIndex == endIndex) {
				// Number does not exist
				break;
			}
			else if (orderedIntegers[middleIndex] > numToFind) {
				endIndex = middleIndex - 1;
			} else {
				firstIndex = middleIndex + 1;
			}
		}
	}
}
