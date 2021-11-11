package com.nt.array;

import java.util.Arrays;
import java.util.Scanner;

public class DynamicArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		String arr[]=new String[size];
		System.out.println("Enter elements of the arry:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.next();
		}
		System.out.println("The array elements are");
		
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);	
		}
	      System.out.println("Enter the index of the required element: ");//if we put more than our enter size it gives AIOOBE
	      int element = sc.nextInt();
	      System.out.println("Element in the given index is :: "+arr[element]);
	
		
		

	}

}
