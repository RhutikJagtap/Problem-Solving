package sorting;

public class BubbleSort2 {
	static void sortArray(int[] arr) {
		for (int turn = 1; turn < arr.length; turn++) {
			boolean isSorted = false;
			for (int j = 0; j < arr.length - turn; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					isSorted = true;
				}
			}
			printArray(arr); // <- move here
			if (!isSorted) {
				break;
			}
		}

	}

	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		System.out.println("Before sorting Array elements");
		printArray(arr);

		System.out.println("After sorting array elements");
		sortArray(arr);

	}

}
