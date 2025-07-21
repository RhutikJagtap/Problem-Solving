package sorting;

//repeatedly selecting the smallest (or largest) element from the unsorted part of the array
//and placing it at the correct position in the sorted part.
public class SelectionSort {

//	Outer Loop (i): Marks the beginning of the unsorted part of the array.
//	Inner Loop (j): Finds the minimum element in the unsorted portion.
//	Swapping: Swaps the minimum element found with the first element of the unsorted part.

	static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;

			printArray(arr);
		}
	}

	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[] = { 5, 3, -7, 4, 8, 2 };

		System.out.println("Before sorting array");
		printArray(arr);

		System.out.println("After sorting array");
		selectionSort(arr);
	}

}
