
public class ArrayMaximumValue {

	public static void main(String[] args) {
		int[] arr = { 1, 2100, 3, 455, 5, 34, 67 };
		// int max = Integer.MIN_VALUE;
		int max = 0;
		for (int e : arr) {
			if (e > max) {
				max = e;
			}
		}
		System.out.println("the value of the maximum element in this array is: " + max);

	}

}