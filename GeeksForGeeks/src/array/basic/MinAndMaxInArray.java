package array.basic;

//Given an array arr. Your task is to find the minimum and maximum elements in the array.
//Note: Return a Pair that contains two elements the first one will be a minimum element
//and the second will be a maximum.

class Pair<K, V> {
	private final K key;
	private final V value;

	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}
}

public class MinAndMaxInArray {
	public Pair<Integer, Integer> getMinMax(int[] arr) {

		if (arr.length == 1) {
			return new Pair(arr[0], arr[0]);
		}

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}

			if (arr[i] > max) {
				max = arr[i];
			}
		}

		return new Pair(min, max);

	}

}
