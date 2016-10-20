package sample.sort;

public class HeapSort {

	public static void sort(int[] arr, int arrSize) {

		makeHeap(arr, arrSize);
		heapSort(arr, arrSize);
	}

	private static void makeHeap(int[] arr, int arrSize) {
		for (int i = 1; i < arrSize; i++) {
			int cur = i;
			while (0 < cur) {
				int par = (cur - 1) / 2;
				if (arr[cur] > arr[par]) {
					int work = arr[par];
					arr[par] = arr[cur];
					arr[cur] = work;
					cur = par;
				} else {
					break;
				}
			}
		}
	}

	private static void heapSort(int[] arr, int arrSize) {
		for (int i = arrSize - 1; 0 < i; i--) {
			int work = arr[i];
			arr[i] = arr[0];
			int j = 0;
			while (j < i) {
				if (j * 2 + 2 < i) { 						// 右左下に子あり
					if (arr[j * 2 + 1] > arr[j * 2 + 2]) {		// 左下の子の方が大
						if (work < arr[j * 2 + 1]) {
							arr[j] = arr[j * 2 + 1];
							j = j * 2 + 1;
						} else {
							arr[j] = work;
							break;
						}
					} else {									// 右下の子の方が大
						if (work < arr[j * 2 + 2]) {
							arr[j] = arr[j * 2 + 2];
							j = j * 2 + 2;
						} else {
							arr[j] = work;
							break;
						}
					}
				} else if (j * 2 + 1 < i) { 				// 左下だけに子あり
					if (work < arr[j * 2 + 1]) {
						arr[j] = arr[j * 2 + 1];
						j = j * 2 + 1;
					} else {
						arr[j] = work;
						break;
					}
				} else { 									// どちらにも子なし
					arr[j] = work;
					break;
				}
			}
		}
	}
}
