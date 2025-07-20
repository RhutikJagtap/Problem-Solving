package day3;

import java.util.Scanner;

public class VowelsCount {
	static int vowelCount(String s) {
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
					ch == 'A' || ch == 'E' || ch == 'I'|| ch == 'O' || ch == 'U')
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string ");
		String s = scanner.nextLine();

		System.out.println("Total vowels ");
		int count = vowelCount(s);
		System.out.println(count);
	}

}
