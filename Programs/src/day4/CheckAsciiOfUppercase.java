package day4;

import java.util.Scanner;

//check the ascii value of uppercase  
public class CheckAsciiOfUppercase {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int n = scanner.nextInt();
		
		if (n>=65 && n<=90) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
	}

}
