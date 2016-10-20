package sample.sort;

public class SpeedTestSort {

	public static void main(String[] args) {
		final int ARRAY_SIZE = 100000;

		int[] arr = new int[ARRAY_SIZE];
		System.out.println("Number of data : " + ARRAY_SIZE);
		long start, time;

		ArrayUtil.setArr(arr, ARRAY_SIZE);

		start = System.currentTimeMillis();
		InsertionSort.sort(arr, ARRAY_SIZE);
		time = System.currentTimeMillis() - start;
		System.out.println("Insertion Sort : " + time + "msec");

		ArrayUtil.setArr(arr, ARRAY_SIZE);

		start = System.currentTimeMillis();
		SelectionSort.sort(arr, ARRAY_SIZE);
		time = System.currentTimeMillis() - start;
		System.out.println("Selection Sort : " + time + "msec");

		ArrayUtil.setArr(arr, ARRAY_SIZE);

		start = System.currentTimeMillis();
		BubbleSort.sort(arr, ARRAY_SIZE);
		time = System.currentTimeMillis() - start;
		System.out.println("Bubble Sort : " + time + "msec");

		ArrayUtil.setArr(arr, ARRAY_SIZE);

		start = System.currentTimeMillis();
		HeapSort.sort(arr, ARRAY_SIZE);
		time = System.currentTimeMillis() - start;
		System.out.println("Heal Sort : " + time + "msec");
	}
}