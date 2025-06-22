package day3;

import java.util.Scanner;

public class EuclidAlgorithm {
	
	 static int euclidGcd(int n1, int n2) {
		 
		 while (n1!=n2) {
			 if(n1>n2)
			 {
				 n1=n1-n2;
			 }else {
				 n2=n2-n1;
			 }			
		}
		
		return n1;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number first");
		int n1 = scanner.nextInt();
		
		System.out.println("Enter the Number second");
		int n2 = scanner.nextInt();
		
		int gcd = euclidGcd(n1,n2);
		System.out.println("GCD = "+gcd);
	}



}
