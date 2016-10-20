package sample.sort;

public class TestSort {
	public static final int ARRAY_SIZE = 1000;

	public static void main(String[] args) {
		int[] arr = new int[ARRAY_SIZE];

		ArrayUtil.setArr(arr, ARRAY_SIZE);
		ArrayUtil.printArr(arr, ARRAY_SIZE);

		System.out.println("sorting...");

//		BubbleSort.sort(arr, ARRAY_SIZE);
//		InsertionSort.sort(arr, ARRAY_SIZE);
//		SelectionSort.sort(arr, ARRAY_SIZE);
		HeapSort.sort(arr, ARRAY_SIZE);

		ArrayUtil.printArr(arr, ARRAY_SIZE);
	}
}
