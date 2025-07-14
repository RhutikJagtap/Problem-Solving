package array;

public class CountPairsWhoseSum {

	static int countPairs(int[] arr, int targetSum) {
		int count = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == targetSum) {
					count++;
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 6, 3, 5, 8, 2 };

		int targetSum = 7;

		int count = countPairs(arr, targetSum);
		System.out.println("Count pairs = " + count);
	}

}
