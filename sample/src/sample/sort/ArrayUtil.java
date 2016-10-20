package sample.sort;

import java.util.Random;

public class ArrayUtil {

	public static void setArr(int[] arr, int arraySize) {
		Random rnd = new Random(1L);
		int MAX_VAL = arraySize * 5;
		for (int i = 0; i < arraySize; i++) {
			arr[i] = rnd.nextInt(MAX_VAL);
		}
	}

	public static void printArr(int[] arr, int arraySize) {
		for (int i = 0; i < arraySize; i++) {
			if (i < 20) {
				System.out.print(arr[i] + " ");
			} else if (arraySize - 20 < i) {
				System.out.print(arr[i] + " ");
			} else if (i == 20) {
				System.out.print(" ... ");
			}
		}
		System.out.println();
	}

}
