package array;

public class FirstRepeatingElement {

	static int printFirstRepeatingElement(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					return arr[i];
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 3, 4, 6, 3, 4 };

		int result = printFirstRepeatingElement(arr);
		System.out.println("First Repeating Element =" + result);
	}

}
