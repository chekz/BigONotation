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
		logNComparisons();
	}

	private void nComparison() {
		System.out.println("ON Algorithim");
		dataSize = 1000000;

		for (int i = 0; i < iterations ; i++) {
			displayNDetails(dataSize);
			dataSize += dataSize;
		}

		System.out.println();
	}
	
	private void displayNDetails(int size) {		
		startTime = System.currentTimeMillis();
		runNAlgorithim(numGenerator.generateRandomIntegers(size));
		endTime = System.currentTimeMillis();

		printDetails(size, endTime - startTime);
	}
	
	private void runNAlgorithim(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			nums[i] += 1;
		}
	}
	
	private void printDetails(int size, long milliseconds) {
		System.out.println(size + " \t\t " + milliseconds);
	}

	private void nSquaredComparison() {
		System.out.println("ON^2 algorithim");

		dataSize = 10000;

		for (int i = 0; i < iterations; i++) {
			displayNSquaredDetails(dataSize);
			dataSize += dataSize;
		}

		System.out.println();
	}

	private void displayNSquaredDetails(int size) {
		startTime = System.currentTimeMillis();
		runNSquaredAlgorithim(numGenerator.generateRandomIntegers(size));
		endTime = System.currentTimeMillis();

		printDetails(size, endTime - startTime);
	}

	private void runNSquaredAlgorithim(int[] nums) {
		for (int i = nums.length - 1; i > 1; i--) {
			for (int j = 0; j < i; j++) {
				nums[j] += 1;
			}
		}
	}
	
	private void logNComparisons() {
		// TODO: Implement a binary search to show a log n complexity algorithm.
	}
}
