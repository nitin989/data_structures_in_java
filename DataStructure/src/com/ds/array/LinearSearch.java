package com.ds.array;

public class LinearSearch {
	
	static int seqential(int[] a ,int k)
	{
		for (int i=0;i<a.length;i++)
		{
			if(a[i]==k){
				return i;
			}			
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int lookupVar = 2;
		int pos = LinearSearch.seqential(arr, lookupVar);
		System.out.println("Position of element "+lookupVar+" in array is : "+pos);
		
	}
}
