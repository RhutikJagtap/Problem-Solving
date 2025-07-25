package sorting;

public class InsertionSort {

	static void insertionSort(int[] arr) {
		// i is used to track unsorted part
		for (int i = 1; i < arr.length; i++) {
			int pickedElement = arr[i];

			// j is used to track sorted part
			int j = i - 1;
			while (j >= 0 && arr[j] > pickedElement) {
				// shifting arr[j] element at one place next
				arr[j + 1] = arr[j];
				j--;
			}
			// insert picked element at right position
			arr[j + 1] = pickedElement;
		}
	}

	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 5, 4, 1, 3, 2 };

		System.out.println("Before sorting array");
		printArray(arr);

		insertionSort(arr);

		System.out.println("After sorting array");
		printArray(arr);

	}

}
