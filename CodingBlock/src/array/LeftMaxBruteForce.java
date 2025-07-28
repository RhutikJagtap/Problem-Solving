package array;

public class LeftMaxBruteForce {

	static int[] leftMax(int[] arr) {
		int[] res = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int max = Integer.MIN_VALUE;
			for (int j = 0; j <= i; j++) {
				if (arr[j] > max) {
					max = arr[j];
				}
			}
			res[i] = max;
		}

		return res;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 1, 6 };

		int[] res = leftMax(arr);

		System.out.println("left max array");
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");

		}
	}
}