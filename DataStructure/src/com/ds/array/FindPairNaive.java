package com.ds.array;
/*given an unsorted array of integers, find a pair with given sum in it
for example 
INPUT :
arr = [8,7,2,5,3,1]
sum = 10
OUTPUT :
Pair found at index 0 and 2 (8,2)
or
Pair found at index 1 and 4 (7,3)*/

/*Time Complexity here is O(n2)
Space Complexity/Auxiliary space use is O(1)*/
public class FindPairNaive {
	// Naive method to find a pair in an array with the given sum
	public static void findPair(int[] arr, int sum) {
		// consider each element except last element
		for (int i = 0; i < arr.length - 1; i++) {
			// consider the ith element till last element
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum) {
					System.out.println("Pair found at index " + i + " and " + j);
					return;
				}
			}
		}
		System.out.println("Pair not found");
	}

	public static void main(String[] args) {

		int[] inpArray = { 8, 7, 2, 5, 3, 1 };
		int sum = 10;
		findPair(inpArray, sum);

	}

}
