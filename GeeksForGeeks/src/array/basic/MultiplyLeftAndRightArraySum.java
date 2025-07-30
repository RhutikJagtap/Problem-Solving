package array.basic;

/*You are given an array of integers, your task is to divide the array into two sub-arrays (left and right) containing half of the array elements.
 *  Find the sum of the subarrays and then return the multiply of both the subarrays.

Note: If the length of the array is odd then the right half will contain one element more than the left half.

Examples :

Input : arr = [1, 2, 3, 4]
Output : 21
Explanation: Sum up an array from index 0 to 1 = 3, Sum up an array from index 2 to 3 = 7. Their multiplication is 21.
Input : arr = [1, 2] 
Output :  2 
Explanation: Their multiplication is 1*2 is equal to 2.
*/
public class MultiplyLeftAndRightArraySum {

	public static int multiply(int[] arr) {
		int leftSum = 0, rightSum = 0;
        int mid = arr.length / 2;

        for (int i = 0; i < arr.length; i++) {
            if (i < mid) {
                leftSum += arr[i];
            } else {
                rightSum += arr[i];
            }
        }
        return leftSum * rightSum;

	}

	public static void main(String[] args) {
		int[] arr= {1, 2, 3, 4};
		
		int result = multiply(arr);
		System.out.println(result);
		
	}

}
