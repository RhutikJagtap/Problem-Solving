package day1;

public class StringTraversing1 {

	public static void main(String[] args) {
		String s = "hello";

		System.out.println("Forward Traversal");
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}

}
