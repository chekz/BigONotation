package BigONotation;

public class BigONotation {
	private NumberGenerator numGenerator = new NumberGenerator();
	private int[] nums;
	long startTime;
	long endTime;
	int dataSize;

	public void nComparison(int iterations) {
		System.out.println("Demonstrating ON algorithim");
		dataSize = 1;

		for (int i = 0; i < iterations; i++) {
			displayNDetails(dataSize);
			dataSize *= 10;
		}

		System.out.println();
	}

	public void nSquaredComparison(int iterations) {
		System.out.println("Demonstrating ON^2 algorithim");

		dataSize = 1;

		for (int i = 0; i < iterations; i++) {
			displayNSquaredDetails(dataSize);
			dataSize *= 10;
		}

		System.out.println();
	}

	private void displayNDetails(int size) {
		System.out.print("Running...");

		startTime = System.currentTimeMillis();
		runNAlgorithim(size);
		endTime = System.currentTimeMillis();

		System.out.println("N algorithim took " + (endTime - startTime) + " to perform on array size " + size);
	}

	private void runNAlgorithim(int size) {
		nums = numGenerator.generateRandomIntegers(size);
		int tempHolder;

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums[i + 1]) {
				tempHolder = nums[i];

				nums[i] = nums[i + 1];
				nums[i + 1] = tempHolder;
			}
		}
	}

	private void displayNSquaredDetails(int size) {
		System.out.print("Running...");

		startTime = System.currentTimeMillis();
		runNSquaredAlgorithim(size);
		endTime = System.currentTimeMillis();

		System.out.print("N Squared algorithim took " + (endTime - startTime)
				+ " miliiseconds to perform on array size " + size + "\n");
	}

	private void runNSquaredAlgorithim(int size) {
		nums = numGenerator.generateRandomIntegers(size);
		int tempHolder;

		for (int i = nums.length - 1; i > 1; i--) {
			for (int j = 0; j < i; j++) {
				if (nums[j] > nums[j + 1]) {
					tempHolder = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = tempHolder;
				}
			}
		}
	}
}
