package day8;

public class Pattern4 {
	
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=(5-i)+1;j++)
			{
				if (j==1 || i==1|| j==(5-i)+1 ) {
					System.out.print(j+" ");					
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
