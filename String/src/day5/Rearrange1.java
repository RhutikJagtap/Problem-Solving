package day5;

import java.util.Scanner;

// 1.given a string convert the string and print the following
// I/P banana
//    a
// O/P b*an*an*a
public class Rearrange1 {

	static String rearrange(String str, char ch) {
		String t = "";

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == ch) {
				t = t + '*' + str.charAt(i);
			} else {
				t = t + str.charAt(i);
			}
		}

		return t;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string");
		String str = scanner.nextLine();

		System.out.println("Enter the character");
		char ch = scanner.next().charAt(0);

		System.out.println("Rearrange string ");
		String result = rearrange(str, ch);
		System.out.println(result);
	}

}
