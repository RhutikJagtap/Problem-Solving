package pattern_programs;

import java.util.Scanner;

public class Pattern9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the value of n");
		int n = scanner.nextInt();

		int row = 1;

		while (row <= n) {
			
			int spaces=1;
			while(spaces<=n-row)
			{
				System.out.print("  ");
				spaces++;
			}
			

			int column = 1;
			while (column <= (2 * row) - 1) {
				System.out.print("* ");
				column++;
			}
			row++;
			System.out.println();
		}
	}

}

//row  spaces   star
//1 	4	  		1       2*1-1
//2 	3	  		3  		2*2-1
//3  	2  	  		5  		2*3-1
//4  	1	  		7  		2*4-1
//5  	0	 		9  		2*5-1
