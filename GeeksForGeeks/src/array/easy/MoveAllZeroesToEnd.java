package array.easy;

/*You are given an array arr[] of non-negative integers. 
You have to move all the zeros in the array to the right end while maintaining the relative order of the non-zero elements. 
The operation must be performed in place, meaning you should not use extra space for another array.


Examples:

Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
Output: [1, 2, 4, 3, 5, 0, 0, 0]
		
Input: arr[] = [10, 20, 30]
Output: [10, 20, 30]
		
Input: arr[] = [0, 0]
Output: [0, 0]
*/
public class MoveAllZeroesToEnd {
	static void pushZerosToEnd(int[] arr) {

		int nz = 0;
		int z = 0;

		while (nz < arr.length) {
			if (arr[nz] != 0) {
				int temp = arr[nz];
				arr[nz] = arr[z];
				arr[z] = temp;
				z++;
				nz++;
			} else {
				nz++;
			}
		}

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 0, 4, 3, 0, 5, 0 };

		pushZerosToEnd(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
