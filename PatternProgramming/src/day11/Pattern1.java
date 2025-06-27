package day11;

public class Pattern1 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			
			if (i%2==0) {
				System.out.print(i+1 +" ");
			}
			for(int j=1;j<=5;j++)
			{
				System.out.print(i+" ");
			}
			if (i%2!=0) {
				System.out.print(i+1 +" ");
			}
			System.out.println();
		}
	}

}
