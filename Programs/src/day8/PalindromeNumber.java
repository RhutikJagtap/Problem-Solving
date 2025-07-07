package day8;

import java.util.Scanner;

public class PalindromeNumber {
	
	static int reverse(int n)
	{
		int reverse=0;
		
		while(n>0)
		{
			int lastdigit=n%10;
			reverse=(reverse*10)+lastdigit;
			n=n/10;
		}
		return reverse;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter  number");
		int n = scanner.nextInt();
		
		int result = reverse(n);
		
		System.out.println(result==n?"palindrome":"Not Palindrome");
		
		
		
	}

}
