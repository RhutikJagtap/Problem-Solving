package array;

public class RightMaxBruteForce {

	static int[] rightMax(int[] arr) {
		int[] res = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int max = Integer.MIN_VALUE;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] > max) {
					max = arr[j];
				}
			}
			res[i] = max;
		}

		return res;
	}

	public static void main(String[] args) {
		int[] arr = { 9, 2, 6, 1, 3 };

		int[] res = rightMax(arr);

		System.out.println("right max array");
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");

		}
	}

}
