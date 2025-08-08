package array;

public class ProductOfArrayExceptItself {
	static int[] productOfArrayExceptItself(int[] arr) {
		int[] res = new int[arr.length];

		for (int i = 0; i < res.length; i++) {
			int rp = 1;
			for (int j = i + 1; j < res.length; j++) {
				rp = rp * arr[j];
			}

			int lp = 1;
			for (int k = i - 1; k >= 0; k--) {
				lp = lp * arr[k];
			}

			res[i] = lp * rp;
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 4, 6 };

		int[] result = productOfArrayExceptItself(arr);

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

}