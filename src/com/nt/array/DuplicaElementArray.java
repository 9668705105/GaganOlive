package com.nt.array;

public abstract class DuplicaElementArray {

	public static void main(String[] args) {
		int arr[]=new int[] {1,2,3,9,7,2,1};
		System.out.println("Duplicate elements are::");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[j]+" ");
				}
			}
		}

	}

}
