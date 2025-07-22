package day5;

import java.util.Scanner;

//* 6.given a two string ,check whether the second string is present in the first string in the same order 
//* I/P hereiamstackerrank
//*      tackerrank
//* O/P yes 
public class FindString {
	
	static String findString(String str1,String str2)
	{
		int i=0;
		int j=0;
		
		while (i<str1.length() && j<str2.length()) {
			
			if (str2.charAt(j)==str1.charAt(i)) {
				i++;
				j++;
			} else {
				i++;	
			}
		}
		
		if (j==str2.length()) {
			return "Yes";
		}
		return "No";
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first the string");
		String str1 = scanner.nextLine();
		
		System.out.println("Enter the second string which you want to find");
		String str2 = scanner.nextLine();
		
		String result = findString(str1,str2);
		System.out.println(result);
	}

}
