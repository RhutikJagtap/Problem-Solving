package array;

//finds the index of the k-th occurrence of a target element in an array
public class KthOccurenceOfElement {

	static int kthOccurence(int[] arr, int target, int k) {
		int occurenceCount = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				occurenceCount++;
			}
			if (occurenceCount == k) {
				return i;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 6, 5, 3, 5, 4 };

		int target = 5;

		int k = 2;

		int index = kthOccurence(arr, target, k);
		System.out.println("kth occurence index = " + index);
	}

}
