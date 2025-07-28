package array;

//left max using prefix approach
public class PrefixMax {

	static int[] leftMax(int[] arr) {
		int[] res = new int[arr.length];

		res[0] = arr[0];

		for (int i = 1; i < arr.length; i++) {
			res[i] = Math.max(res[i - 1], arr[i]);
		}

		return res;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 1, 6 };

		int[] res = leftMax(arr);

		System.out.println("left max array");
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");

		}
	}

}
