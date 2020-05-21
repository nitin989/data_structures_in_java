package com.ds.array;

public class BinarySearchRecursively {

	public static int runBinarySearchRecursively(int[] sortedArray, int key, int low, int high) {
		int mid = (high + low) / 2;
		if (high < low) {
			return -1;
		}
		if (key == sortedArray[mid]) {
			return mid;
		} else if (key < sortedArray[mid]) {
			return runBinarySearchRecursively(sortedArray, key, low, mid - 1);
		} else if (key > sortedArray[mid]) {
			return runBinarySearchRecursively(sortedArray, key, mid + 1, high);
		}
		return -1;

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		int k = 2;
		int ind = BinarySearchIterative.runBinarySearchIteratively(arr, k, 0, arr.length);
		System.out.println("Poition of element " + k + " in array is " + ind);
	}

}
