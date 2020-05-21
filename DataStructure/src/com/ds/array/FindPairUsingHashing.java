package com.ds.array;

import java.util.HashMap;
import java.util.Map;

public class FindPairUsingHashing {
	
	public static void findPair(int[] arr, int sum)
	{
		// create an empty HashMap
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			//check if pair(arr[i],sum-arr[i]) exists
			if (map.containsKey(sum -arr[i]))
			{
				System.out.println("Pair found at index "+map.get(sum-arr[i])+" and " +i);
				return;
			}
			map.put(arr[i],i);
		}
		System.out.println("Pair not found");
	}
	
	public static void main(String[] args) {
		
		int[] inpArray = { 8, 7, 2, 5, 3, 1 };
		int sum = 10;
		findPair(inpArray, sum);
		
	}

}
