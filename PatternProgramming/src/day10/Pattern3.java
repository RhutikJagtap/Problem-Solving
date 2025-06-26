package day10;


public class Pattern3 {
	
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int spaces=1;spaces<=5-i;spaces++)
			{
				System.out.print("  ");
			}
			
			int count=1;
			for(int j=1;j<=(2*i)-1;j++)
			{
				if (j<i) {
					System.out.print(count++ +" ");	
				} else {
					System.out.print(count-- +" ");
				}
			}
			System.out.println();
		}
	}

}
