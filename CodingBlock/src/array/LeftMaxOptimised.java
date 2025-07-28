package array;

public class LeftMaxOptimised {
	static int[] leftMax(int[] arr) {
		int[] res = new int[arr.length];

		int currentMax = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > currentMax) {
				currentMax = arr[i];
			}
			res[i] = currentMax;
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
