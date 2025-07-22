package day5;

import java.util.Scanner;

//* 4.given a string convert the string and print the following 
//* I/P banana
//* O/P bAanAanAa
public class Rearrange2 {
	static String rearrange(String str) {
		String t = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				t = t + '*' + ch;
			} else {
				t = t + ch;
			}
		}

		return t;
	}

	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();

		System.out.println("Rearrange string ");
		String result = rearrange(str);
		System.out.println(result);

	}

}
