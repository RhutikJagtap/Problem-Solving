package day7;

import java.util.Scanner;

public class BinaryToDecimal {
	
	static int binaryToDecimal(int n)
	{
		int res=0;
		int pow=0;
		
		while (n>0) {
			int lastdigit=n%10;
			res=res+lastdigit*(int)Math.pow(2, pow);
			pow++;
			n=n/10;
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a binary number(only 1 and 0)");
		int n = scanner.nextInt();
		
		int decimal = binaryToDecimal(n);
		System.out.println("Decimal ="+decimal);
		
	}

}
