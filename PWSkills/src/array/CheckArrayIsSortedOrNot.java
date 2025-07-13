package array;

//consider increasing order
//if  ith  element is smaller  than i-1 th element  then array is not sorted
public class CheckArrayIsSortedOrNot {

	static boolean isSorted(int[] arr) {
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < arr[i - 1]) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 8, 10 };

		boolean result = isSorted(arr);

		if (result) {
			System.out.println("Array is Sorted");
		} else {
			System.out.println("Array is Not Sorted ");
		}
	}

}
