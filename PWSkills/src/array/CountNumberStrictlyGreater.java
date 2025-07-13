package array;

public class CountNumberStrictlyGreater {
	static int count(int[] arr, int target) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > target) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 4, 2, 3, 1, 4 };

		int target = 3;

		int result = count(arr, target);
		System.out.println("Count = "+result);
	}

}
