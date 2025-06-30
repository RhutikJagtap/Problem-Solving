package day1;

public class OddAndMultipleOf3 {
	
	public static void main(String[] args) {
		for(int i=1;i<=50;i++)
		{
			if (i%2!=0 && i%3==0) {
				System.out.println(i);
			}
		}
	}

}
