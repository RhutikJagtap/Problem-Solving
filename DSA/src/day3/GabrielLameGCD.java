package day3;

import java.util.Scanner;

public class GabrielLameGCD {
	
	static int lameGcd(int n1,int n2) {
		while (n1!=0 && n2 !=0) {
			if(n1>n2)
			{
				n1=n1%n2;
			}else {
				n2=n2%n1;
			}
		}
		
		if (n1!=0) {
			return n1;
		}else {
			return n2;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number first");
		int n1 = scanner.nextInt();
		
		System.out.println("Enter the Number second");
		int n2 = scanner.nextInt();
		
		int gcd = lameGcd(n1,n2);
		System.out.println("GCD = "+gcd);
	}

}

