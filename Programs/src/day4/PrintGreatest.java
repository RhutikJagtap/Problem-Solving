package day4;

import java.util.Scanner;

public class PrintGreatest {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first Number");
		int n1=scanner.nextInt();
		
		System.out.println("Enter the second Number");
		int n2=scanner.nextInt();
		
		System.out.println("Enter the third Number");
		int n3=scanner.nextInt();
		
		System.out.println("Enter the four Number");
		int n4=scanner.nextInt();
		
		int res1=n1>n2?n1:n2;
		int res2=n3>n4?n3:n4;
		
		int result =res1>res2?res1:res2;
		System.out.println(result);

	}

}
