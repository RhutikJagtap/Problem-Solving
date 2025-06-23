package day4;

import java.util.Scanner;

public class LCM {
	
	static int lcm(int n1,int n2)
	{
		int res=Math.max(n1, n2);
		
		while(true)
		{
			if (res%n1==0 && res%n2==0) {
				break;
			}
			res++;
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first Number");
		int n1 = scanner.nextInt();
		
		System.out.println("Enter the second Number");
		int n2 = scanner.nextInt();
		
		int lcm = lcm(n1,n2);
		System.out.println("LCM = "+lcm);
		
	}

}
