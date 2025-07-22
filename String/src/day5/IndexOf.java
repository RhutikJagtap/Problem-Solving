package day5;

import java.util.Scanner;

public class IndexOf {
	
	static int indexOf(String str,char key)
	{	
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)==key) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String str = scanner.nextLine();
		
		System.out.println("Enter the character");
		char ch = scanner.next().charAt(0);
		
		int index = indexOf(str,ch);
		System.out.println(index);
	}

}
