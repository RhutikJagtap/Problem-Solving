package array.basic;

import java.util.ArrayList;
import java.util.List;

/*Given an array arr[] containing strings of names. Your task is to return the longest string. 
 * If there are multiple names of the longest size, return the first occurring name.

Examples :

Input: arr[] = ["Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks"]
Output: "GeeksforGeeks"
Explanation: name "GeeksforGeeks" has maximum length among all names. 

Input: arr[] = ["Apple", "Mango", "Orange", "Banana"]
Output: "Orange"
Explanation: names "Orange" and "Banana" both have maximum length among all names 
but Orange comes first so answer will be "Orange". */
public class DisplayLongestName {
	public static String longest(List<String> arr) {
		String result = "";

		for (String str : arr) {
			if (str.length() > result.length()) {
				result = str;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
//		"Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks"
		list.add("Geek");
		list.add("Geeks");
		list.add("Geeksfor");
		list.add("GeeksforGeek");
		list.add("GeeksforGeeks");

		String result = longest(list);
		System.out.println(result);
	}

}
