package array.basic;

/*Given an array, arr[] of positive elements, and an integer k, the task is to left-rotate the array k indexes.
Note: Rotate the array even if the k is greater than the size of the array. 
In these cases after every full array rotation, the array comes the same as the original array.

Examples:

Input: arr[] = [1, 2, 3, 4, 5, 6, 7], k = 2 
Output: [3, 4, 5, 6, 7, 1, 2]
Explanation: Rotating the above array by 2 will make the output array.

Input: arr[] = [1, 2, 3, 4, 5, 6],  k = 12
Output: [1, 2, 3, 4, 5, 6]
Explanation: left Rotation of above array 12 times gives same array as output. 

Input: arr[] = [1, 2, 3, 4, 5, 6],  k = 11
Output: [6, 1, 2, 3, 4, 5]
Explanation: left Rotation of above array 11 times & in resultant output 6 comes to the statring position.*/
public class QuickLeftRotation {

	static void leftRotate(int arr[], int k) {

		int rotation = k % arr.length;

		for (int j = 1; j <= rotation; j++) {
			int temp = arr[0];
			for (int i = 0; i < arr.length - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[arr.length - 1] = temp;
		}

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };

		int k = 11;

		leftRotate(arr, k);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
