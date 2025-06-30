package day1;

public class MultipleOf3Or5 {

	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {
			if (i%3==0 || i%5==0) {
				System.out.println(i);
			}

		}
	}

}
