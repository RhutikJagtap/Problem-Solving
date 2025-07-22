package day5;


import java.util.Scanner;

public class Rearrange3 {
	static String rearrange(String str)
	{
		String t="";
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			
			if (ch=='a') {
				t=t+(char)(ch-32);
			}else {
				t=t+ch;
			}
			
		}
		
		return t;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		
		String result = rearrange(str);
		System.out.println(result);
	}

}
