package sample.sort;

public class InsertionSort {
	public static void sort(int[] arr, int arrSize) {
		for (int i = 1; i < arrSize; i++) {
			for (int j = i; 0 < j; j--) {
				if (arr[j - 1] > arr[j]) {
					int work = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = work;
				} else {
					break;
				}
			}
		}
	}
}
