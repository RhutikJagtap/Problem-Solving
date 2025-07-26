package day8;

import java.util.Scanner;

public class RemoveVowels {
	static String removeVowels(String s)
	{
		String t="";
		
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if (!(ch=='A' || ch=='E'|| ch=='I'|| ch=='O'|| ch=='U'||
					ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')) {
				t=t+ch;
			}
		}
		return t;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the string ");
		String str = scanner.nextLine();
		
		System.out.println("After Remove vowels");
		String result=removeVowels(str);
		System.out.println(result);
	}

}
