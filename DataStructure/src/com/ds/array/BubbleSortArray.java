package com.ds.array;

/*TIME COMPLEXITY OF THIS ALGORITHM 
BASE CASE = omega(n)
WORST CASE = O(n2)
AVG CASE = O(n2)
*/
public class BubbleSortArray {

	public static int[] bubbleSort(int[] arr) {
		int flag = 1;
		for (int i = 1; i < arr.length && flag == 1; i++) // n-1 passes
		{
			flag = 0;
			for (int j = 1; j <= arr.length - i; j++) // n-1 iterations
			{

				if (arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
					flag = 1;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {

		int[] inpArray = { 8, 7, 2, 5, 3, 1 };
		int[] outArray = bubbleSort(inpArray);
		for (int i = 0; i < outArray.length; i++) {
			System.out.println(outArray[i]);
		}

	}

}
