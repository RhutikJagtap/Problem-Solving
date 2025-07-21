package sorting;

//bubble sort = largest element place at the end by comparing adjacent array elements 
public class BubbleSort {

	static void sortArray(int[] arr) {
//		n-1 turn
		for (int turn = 1; turn < arr.length; turn++) {
			for (int j = 0; j < arr.length - turn; j++) {
				// comparing adjacent array elements
				if (arr[j] > arr[j + 1]) {
					// swap
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				printArray(arr);
			}
			System.out.println();
		}
	}

	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

	public static void main(String[] args) {
		int[] arr = { 5, 4, 3, 2, 1 };

		sortArray(arr);
	}

}

// turn
//i<length-1      j<length-turn
//1turn 			0 1 2 3  <4
//2turn 			0 1 2     <3
//3 turn 			0 1       <2
//4 turn 			0          <1

