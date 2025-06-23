package day7;

public class Pattern2 {
	
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int spaces=1;spaces<=5-i;spaces++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				if (j==1||j==i||i==5) {
					System.out.print(i+" ");					
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
