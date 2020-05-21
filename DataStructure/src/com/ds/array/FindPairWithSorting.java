package com.ds.array;

import java.util.Arrays;

/*Time Complexity :- O(nlog(n))
Space Complexity :- O(1)*/
public class FindPairWithSorting {

	public static void findPair(int[] arr, int sum) {
		Arrays.sort(arr);
		int low = 0;
		int high = arr.length - 1;

		while (low < high) {
			if (arr[low] + arr[high] == sum) {
				System.out.println("Pair found at index " + low + " and " + high);
			}
			if (arr[low] + arr[high] < sum) {
				low++;
			} else {
				high--;
			}

		}

	}

	public static void main(String[] args) {
		int[] inpArray = { 8, 7, 2, 5, 3, 1 };
		int sum = 10;
		findPair(inpArray, sum);

	}

}
