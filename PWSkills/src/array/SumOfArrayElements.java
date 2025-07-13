package array;

public class SumOfArrayElements {

	static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		return sum;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 3 };

		int sum = sum(arr);
		System.out.println("Sum of array elements = "+sum);
	}

}
