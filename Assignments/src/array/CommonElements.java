package array;

public class CommonElements {
	// print common elements from two array
	static void commonElements(int arr1[], int arr2[]) {
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.print(arr1[i] + " ");
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr1[] = { 3, 5, 6, 8, 9 };
		int arr2[] = { 2, 3, 4, 6, 7, 8, 8 };

		commonElements(arr1, arr2);
	}

}
