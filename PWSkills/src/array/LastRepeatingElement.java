package array;

public class LastRepeatingElement {

	static int printLastRepeatingElement(int[] arr) {
		for (int i = arr.length - 1; i >= 1; i--) {
			for (int j = i - 1; j >= 0; j--) {
				if (arr[i] == arr[j]) {
					return arr[i];
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 3, 4, 6, 3, 4 };

		int result = printLastRepeatingElement(arr);
		System.out.println("Last Repeating Element =" + result);
	}

}
