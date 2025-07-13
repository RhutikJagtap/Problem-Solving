package array;

//write a function which returns array of max and min value
public class PrintSmallestAndLargest {

	static int[] smallestAndLargest(int[] arr) {
		int max = arr[0];
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

			if (arr[i] < min) {
				min = arr[i];
			}
		}

		return new int[] { max, min };

	}

	public static void main(String[] args) {
		int[] arr = { 3, 1, 7, 34, 99, 2 };

		int[] result = smallestAndLargest(arr);

		System.out.println("Maximum = " + result[0]);
		System.out.println("Minimum = " + result[1]);

	}

}
