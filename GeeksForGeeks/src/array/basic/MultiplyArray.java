package array.basic;

/*Calculate the product of all the elements in an array.

Example 1:

Input:
5
1 2 3 4 5
Output:
120
 

Example 2:

Input:
10
5 5 5 5 5 5 5 5 5 5
Output:
9765625*/
public class MultiplyArray {
	public static int product(int arr[], int n) {
		int product = 1;
		for (int i = 0; i < arr.length; i++) {
			product = product * arr[i];
		}

		return product;
	}

	public static void main(String[] args) {
		int[] arr = {1,1, 2, 2, 3, 4, 5};

		int n = 7;

		int result = product(arr, n);
		System.out.println(result);

	}

}
