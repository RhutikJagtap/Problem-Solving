package array;

//Approach1
public class LastOccurenceOfElement1 {

	static int lastOccurence(int[] arr, int k) {
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] == k) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 6, 5, 3, 5, 4 };

		int k = 5;
		
		int result = lastOccurence(arr, k);
		System.out.println("Last Occurence at index = "+result);

	}

}
