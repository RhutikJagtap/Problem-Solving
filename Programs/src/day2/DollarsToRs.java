package day2;

import java.util.Scanner;

public class DollarsToRs {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the dollars");
		int dollars=scanner.nextInt();
		
		float rs=dollars*84.31f;
		
		System.out.println(dollars +" = "+rs+" Rs");
	}

}
