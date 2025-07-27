package day10;

import java.util.Scanner;

public class RepeatingStringHackerRank {

	static int repeatedString(String s, int n) {
		// Step 1: Count 'a' in original string
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				count++;
			}
		}

		// Step 2: How many full repeats of string in n
		int repeat = n / s.length();

		// Step 3: Count from full repeats
		int count1 = repeat * count;

		// Step 4: Remaining characters
		int remaining = n % s.length();

		// Step 5: Count 'a' in remaining part
		int count2 = 0;
		for (int i = 0; i < remaining; i++) {
			if (s.charAt(i) == 'a') {
				count2++;
			}
		}

		// Step 6: Total count
		return count1 + count2;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string:");
		String s = scanner.nextLine();

		System.out.println("Enter the n value:");
		int n = scanner.nextInt();

		int result = repeatedString(s, n);
		System.out.println("Total 'a' count: " + result);
	}
}

/*
 * abca abca ab complete repeated =2 threfore 10/4 = 2 in one bunch count of a =
 * 2 total count=repeat*count =2*2 =4
 * 
 * remaining characters found = 10%4 = 2 in original string till index less than
 * 2 find how many a's count2=1
 * 
 * output = count1+count2
 * 
 * ---------------------- Steps: Step 1: Count 'a' in original string Step 2:
 * How many full repeats of string in n Step 3: Count from full repeats Step 4:
 * Remaining characters Step 5: Count 'a' in remaining part
 * 
 */
