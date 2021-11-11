//Question 1 
package com.nt.array;

import java.util.Arrays;

class MoveAllZeroToEnd {
	public static void move(int[] A) {
		int k = 0;
		for (int i : A) {
			if (i != 0) {
				A[k++] = i;
			}
		}
		for (int i = k; i < A.length; i++) {
			A[i] = 0;
		}
	}
	public static void main(String[] args) {
		int[] A = { 0, 1, 0, 0, 4, 0, 5, 0 };
		move(A);
		System.out.println("Output are" + Arrays.toString(A));
	}
}
