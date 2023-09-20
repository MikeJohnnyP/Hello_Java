import java.util.Arrays;

public class Extra {

	/*
	 * 1) WRITE A METHOD TO SWITCH VALUE AT 2 POSITIONS IN ONE DIMENSION
	 * ARRAY
	 */
	public void switchPos(int[] array, int position1, int position2) {
		if (position1 < 0 || position1 >= array.length || position2 < 0 || position2 >= array.length) {
			System.out.println("Out of length!!");
		} else {
			int temp = array[position1];
			array[position1] = array[position2];
			array[position2] = temp;
		}
		System.out.println("Swap: " + Arrays.toString(array));
	}

	/*
	 * WRITE A METHOD TO DELETE VALUE AT THE TARGET POSITION IN ONE
	 * DIMENSION ARRAY
	 */
	public void delete(int[] array, int position1) {
		int[] removeArray = new int[array.length - 1];
		if (position1 < 0 || position1 >= array.length) {
			System.out.println("Out of length!!");
		} else {
			for (int i = 0; i < array.length - 1; i++) {
				if (i < position1) {
					removeArray[i] = array[i];
				}
				if (i >= position1) {
					removeArray[i] = array[i + 1];
				}
			}
			System.out.println("Delete: " + Arrays.toString(removeArray));
		}

	}

	/*
	 * 3) WRITE A METHOD TO INSERT VALUE AT THE TARGET POSITION IN ONE
	 * DIMENSION ARRAY
	 */
	public void insert(int[] array, int position, int value) {
		int[] addPos = new int[array.length + 1];
		if (position < 0 || position >= array.length) {
			System.out.println("Out of length!!");
		} else {
			for (int i = 0; i < array.length; i++) {
				if (i < position) {
					addPos[i] = array[i];
				}
				if (i >= position) {
					addPos[i + 1] = array[i];
					addPos[position] = value;
				}

			}
			System.out.println("Insert: " + Arrays.toString(addPos));
		}

	}

	/*
	 * 4) WRITE A METHOD TO REVERSE ONE DIMENSION ARRAY
	 */
	public void reverse(int[] array) {
		int[] x = array.clone();
		for (int i = x.length - 1; i >= 0; i--) {
			array[x.length - 1 - i] = x[i];
		}
		System.out.println("Reverse: " + Arrays.toString(array));
	}

	public void reverse1(int[] array) {
		int x;
		if (array.length % 2 == 0) {
			for (int i = 0; i < array.length / 2; i++) {
				x = array[i];
				array[i] = array[array.length - 1 - i];
				array[array.length - 1 - i] = x;
			}
			System.out.println("Reverse1: " + Arrays.toString(array));
		} else {
			for (int i = 0; i < (double) array.length / 2; i++) {
				x = array[i];
				array[i] = array[array.length - 1 - i];
				array[array.length - 1 - i] = x;
			}
			System.out.println("Reverse1: " + Arrays.toString(array));
		}
	}

	/*
	 * 5) WRITE A METHOD TO FIND DUPLICATE TIMES OF TARGET IN ONE
	 * DIMENSION ARRAY
	 */
	public int duplicate(int[] array, int target) {
		int temp = 0;
		for (int i : array) {
			if (i == target) {
				temp++;
			}

		}
		return temp;

	}

	// Test Class
	public static void main(String[] args) {
		Extra metExtra = new Extra();
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(Arrays.toString(arr));
		metExtra.switchPos(arr, 3, 4);
		metExtra.delete(arr, 4);
		metExtra.reverse(arr);
		metExtra.reverse1(arr);
		System.out.println("Times of target appear: " + metExtra.duplicate(arr, 2));
		metExtra.insert(arr, 7, 7);
	}

}
