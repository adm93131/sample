package sample.sort;

public class BubbleSort {

	public static void sort(int[] arr, int arrSize) {
		for (int i = arrSize - 1; 0 < i; i--) {

			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					int work = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = work;
				}
			}
		}
	}
}
