//Question 6
package com.nt.array;

import java.util.*;

class SelectionSortArray {
	static void sel_sort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int min_idx = i;
			for (int j = i + 1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;

			// swap minimum element with compared element
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}

	public static void main(String args[]) {
		int numArray[] = { 7, 5, 2, 20, 42, 15, 23, 34, 10 };
		System.out.println("Original Array:" + Arrays.toString(numArray));
		// call selection sort 
		sel_sort(numArray);
		// print the sorted array
		System.out.println("Sorted Array:" + Arrays.toString(numArray));
	}
}
