package array.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*Check whether given two arrays a[] and b[] are identical or not. Two arrays are called identical arrays
if they contain the same element with the same count, regardless of the order of elements.

Examples:

Input: a[] = [1, 2, 3, 4, 5], b[] = [3, 4, 1, 2, 5]
Output: true
Explanation: Here we can see array a[] = [1, 2, 3, 4, 5] and b[] = [3, 4, 1, 2, 5]. 
If we look both the array then we can get that array b[] is the permutation of a[]. So, both array.are identical. 

Input: a[] = [1, 2, 4], b[] = [3, 2, 1]
Output: false
Explanation: Here we can see that, missing 4 in array b and has 3 so they are not identical.
*/
public class TheProblemOfIdenticalArrays {

	public static boolean isIdentical(List<Integer> a, List<Integer> b) {
		if (a.size() != b.size()) {
			return false;
		}

		Collections.sort(a);
		Collections.sort(b);

		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) != b.get(i)) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		List a = new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);

		List b = new ArrayList();
		b.add(3);
		b.add(4);
		b.add(3);
		b.add(1);
		b.add(5);

		boolean result = isIdentical(a, b);
		System.out.println(result);
	}

}
