package com.nt.array;

import java.util.Scanner;

public class FindMissingNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter thetotal number which u want");
		int n = sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=(n+1)*(n+2)/2;
		for(int i=0;i<n;i++) {
			sum=sum-arr[i];
		}
		System.out.println("Missing Element is "+sum);

	}

}
