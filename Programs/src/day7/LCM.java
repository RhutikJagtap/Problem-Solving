package day7;

import java.util.Scanner;

public class LCM {
	
	static int lcm(int n1,int n2) {
		
		for(int i=1;;i++)
		{
			if (i%n1==0 && i%n2==0) {
				return i;
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int n1 = scanner.nextInt();
		
		System.out.println("Enter second number");
		int n2 = scanner.nextInt();
		
		int result=lcm(n1,n2);
		System.out.println("LCM ="+result);
	}

}
