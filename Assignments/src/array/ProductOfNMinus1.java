package array;

public class ProductOfNMinus1 {

	static long product(int[] arr) {
		long product = 1;

		for (int i = 0; i < arr.length; i++) {
			product = product * arr[i];
		}
		return product;
	}

	static long[] productOfArrayExceptItself(int[] arr) {
		long[] res = new long[arr.length];

		long product = product(arr);

		for (int i = 0; i < res.length; i++) {
			res[i] = product / arr[i];
		}

		return res;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 4, 5 };
		
		long[] res = productOfArrayExceptItself(arr);
		
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]+" ");
		}
	}

}
