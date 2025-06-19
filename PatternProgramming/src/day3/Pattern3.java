package day3;

public class Pattern3 {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			int count=i;
			for(int j=1;j<=5;j++) {
				System.out.print(count++ +" ");
			}
			System.out.println();
		}
		
	}

}
