package array;

public class FindMaximumFromArray {

	static int max(int[] arr) {
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 3 };

		int max = max(arr);
		System.out.println("Maximum Element in Array = "+max);
	}

}
