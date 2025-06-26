package day10;

//1 
//1 2 1 
//1 2 3 2 1 
//1 2 3 4 3 2 1 
//1 2 3 4 5 4 3 2 1
public class Pattern2 {
	
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
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
