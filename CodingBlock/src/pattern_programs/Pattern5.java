package pattern_programs;

import java.util.Scanner;

//* * * * * 
//  * * * * 
//    * * * 
//      * * 
//      * 


public class Pattern5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int row=1;
		
		while (row<=n) {
			
			int spaces=1;
			while (spaces<row) {
				System.out.print("  ");
				spaces++;
			}
			
			int column=1;
			while (column<=n-row+1) {
				System.out.print("* ");
				column++;
			}
			row++;
			System.out.println();
			
		}
	}

}


