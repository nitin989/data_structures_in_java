package com.ds.array;

public class BinarySearchIterative {

	public static int runBinarySearchIteratively(int[] sortedArray, int key, int low, int high) {
		int index = 0;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (sortedArray[mid] < key) {
				low = mid + 1;

			} else if (sortedArray[mid] > key) {
				high = mid - 1;
			} else if (sortedArray[mid] == key) {
				index = mid;
				break;
			}

		}
		return index;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		int k = 18;
		int ind = BinarySearchIterative.runBinarySearchIteratively(arr, k, 0, arr.length);
		System.out.println("Poition of element " + k + " in array is " + ind);

	}

}
