package array.basic;

//Given an array arr, rotate the array by one position in clockwise direction.
//Examples:
//
//Input: arr[] = [1, 2, 3, 4, 5]
//Output: [5, 1, 2, 3, 4]
//Explanation: If we rotate arr by one position in clockwise 5 come to the front and remaining those are shifted to the end.
//Input: arr[] = [9, 8, 7, 6, 4, 2, 1, 3]
//Output: [3, 9, 8, 7, 6, 4, 2, 1]
//Explanation: After rotating clock-wise 3 comes in first position.
public class RotateArraybyOne {

	static void rotate(int[] arr) {
		int lastElement = arr[arr.length - 1];

		for (int i = arr.length - 2; i >= 0; i--) {
			//shift element
			arr[i + 1] = arr[i];
		}
		arr[0] = lastElement;
	}
	
	//or
	static void rotate2(int[] arr) {
		int lastElement = arr[arr.length - 1];
		
		for (int i = arr.length - 1; i >= 1; i--) {
			//shift element
			arr[i] = arr[i-1];
		}
		arr[0] = lastElement;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		rotate(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
/*
 * first we take last element and remind it because if we shift element it can
 * be gone lastElement=arr[arr.length-1]
 * 
 * arr[4]=arr[3] //3rd index element will be place at index 4 arr[3]=arr[2]
 * //2nd index element will be place at index 3 arr[2]=arr[1] //1st index
 * element will be place at index 2 arr[1]=arr[0] //oth index element will be
 * place at index 1
 * 
 * arr[0]=lastElement
 * 
 */
