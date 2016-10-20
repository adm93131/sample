package sample.sort;

public class SelectionSort {
	public static void sort(int[] arr, int arrSize) {
		for (int i = 0; i < arrSize - 1; i++) {
			int maxIdx = i;
			for (int j = i + 1; j < arrSize; j++) {
				if (arr[maxIdx] > arr[j]) {
					maxIdx = j;
				}
			}
			int work = arr[i];
			arr[i] = arr[maxIdx];
			arr[maxIdx] = work;
		}
	}
}
