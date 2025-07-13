package array;

public class CountOccurenceOfParticularElement {

	static int countOccurence(int[] arr, int k) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == k) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 6, 5, 1, 5 };

		int k = 5;

		int count = countOccurence(arr, k);
		System.out.println("Element "+k+" occur "+count+" times");
	}

}
