package day2;

import java.util.Scanner;

public class CountWords {
	
	static int countWords(String s)
	{
		int count=0;
		
		for (int i = 0; i < s.length()-1; i++) {
			if (s.charAt(i)==' ' && s.charAt(i+1)!=' ') {
				count++;
			}
		}
		
		return s.charAt(0)==' '?count:count+1;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String s = scanner.nextLine();
		
		System.out.println("Total words");
		int count = countWords(s);
		System.out.println(count);
	}

}
