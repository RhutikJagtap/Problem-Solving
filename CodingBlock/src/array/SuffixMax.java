package array;

public class SuffixMax {
	static int[] rightMax(int[] arr) {
		int[] res = new int[arr.length];

		res[arr.length - 1] = arr[arr.length - 1];
		for (int i = arr.length - 2; i >= 0; i--) {
			res[i] = Math.max(res[i + 1], arr[i]);
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
