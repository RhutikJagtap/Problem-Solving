package day7;

import java.util.Scanner;

//efficient
public class FirstNCommonMultipleEfficient {
	
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
	
	static int lcm(int n1,int n2){
		
		return (n1*n2)/gcd(n1,n2);
	}
	
	static void printFirstNCommonMultiples(int n1,int n2,int limit)
	{
		for(int i=1;i<=limit;i++)
		{
			int lcm=lcm(n1,n2);
			System.out.print(lcm*i+" ");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int n1 = scanner.nextInt();
		
		System.out.println("Enter second number");
		int n2 = scanner.nextInt();
		
		System.out.println("Enter a number that many common multiples you want ");
		int limit = scanner.nextInt();
		
		printFirstNCommonMultiples(n1,n2,limit);
	}

}
