package day7;

import java.util.Scanner;

public class EuclidAlgorithm {
	
	static int euclidGCD(int n1,int n2)
	{
		while(n1!=n2)
		{
			if (n1>n2) {
				n1=n1-n2;
			}else {
				n2=n2-n1;
			}
		}
		
		return n1;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int n1 = scanner.nextInt();
		
		System.out.println("Enter second number");
		int n2 = scanner.nextInt();
		
		int result = euclidGCD(n1,n2);
		System.out.println("GCD="+result);
		

	}

}
