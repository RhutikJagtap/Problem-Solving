package array.easy;

/*Given an array, arr[] of positive integers. 
 * Your task is to return the product of array elements under the given modulo, mod with the value of 1000000007.

Note: The modulo operation finds the remainder after the division of one number by another. 
For example, k(mod(m))=k%m= remainder obtained when k is divided by m

Examples:

Input: arr[] = [1, 2, 3, 4]
Output: 24

Input: arr[] = [100000, 100000, 100000]
Output: 993000007
*/
public class ProductOfAnArray {
	public static long product(long arr[]) {
		long product = 1L;
		long mod = 1000000007L;

		for (int i = 0; i < arr.length; i++) {
			product = (product * (arr[i] % mod)) % mod;
		}
		return product;
	}

	public static void main(String[] args) {
		long[] arr = { 1, 2, 3, 4 };

		long result = product(arr);
		System.out.println(result);
	}
}
