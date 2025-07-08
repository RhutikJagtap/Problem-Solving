package pattern_programs;

import java.util.Scanner;

public class Pattern10 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the value of n");
		int n = scanner.nextInt();
		
		int row=1;
		int k=1;
		while (row<=n) {
			
			int spaces=1;
			while(spaces<row)
			{
				System.out.print("  ");
				spaces++;
			}
			
			int column=1;
			while (column<=(n*2)-k) {
				column++;
				System.out.print("* ");
			}
			k=k+2;
			row++;
			System.out.println();
		}
		
	}

}

//row    stars                 spaces
//1   		 9  <	5*2-1       0
//2   		 7  <  5*2-3		  1
//3   		 5  <	5*2-5		  2
//4    		 3	<	5*2-7		  3
//5    		 1  <  5*2-9       4