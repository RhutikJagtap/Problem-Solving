package day7;

import java.util.Scanner;

public class LCM_Formula {
	
	static int gcd(int n1,int n2)
	{
		while (n1!=n2) {
			if (n1>n2) {
				n1=n1-n2;
			} else {
				n2=n2-n1;
			}
		}
		
		return n1;
	}
	
	static int lcm(int n1,int n2)
	{
		return (n1*n2)/gcd(n1,n2);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a first number");
		int n1 = scanner.nextInt();
		
		System.out.println("Enter a second number");
		int n2 = scanner.nextInt();
		
		int result = lcm(n1,n2);
		System.out.println("LCM = "+result);
	}

}
