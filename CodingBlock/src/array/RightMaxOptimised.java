package array;

public class RightMaxOptimised {

	static int[] rightMax(int[] arr) {
		int[] res = new int[arr.length];

		int currentMax = Integer.MIN_VALUE;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] > currentMax) {
				currentMax = arr[i];
			}
			res[i] = currentMax;
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
