package com.nt.array;

public class ascendingOrder {

	public static void main(String[] args) {
		int[] arr=new int[] {4,8,1,6,7,2};
		int let=0;
		System.out.println("Before ascending");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					let=arr[i];
					arr[i]=arr[j];
					arr[j]=let;
				}
			}
		}
		System.out.println();
		System.out.println("after ascending");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
