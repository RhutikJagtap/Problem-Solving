package day4;

import java.util.Scanner;

public class LCMFormula {
	
	static int lameGCD(int n1,int n2)
	{
		while (n1!=0 && n2!=0) {
			if (n1>n2) {
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
	
	static int lcm(int n1,int n2)
	{
		int gcd = lameGCD(n1, n2);
		
		return n1*n2/gcd;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number first ");
		int n1=scanner.nextInt();
		
		System.out.println("Enter the number first ");
		int n2=scanner.nextInt();
		
		int lcm = lcm(n1,n2);
		System.out.println("LCM = "+lcm);

	}

}
