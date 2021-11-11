//Question 10 
package com.nt.array;

import java.util.Scanner;

public class RemoveCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
         int[] arr= {1,2,3,4,5,6,7,8,9,10,4,11};
         System.out.println("Enter the element which u want to remove::");
         int ele=sc.nextInt();
         int temp;
         
         for(int i=0;i<arr.length;i++) {
        	 for(int j=i;j<arr.length;j++) {
        		 if(arr[i]>arr[j]) {
        			 temp=arr[i];
        			 arr[i]=arr[j];
        			 arr[j]=temp;
        		 }
        	 }
         }
         for(int a:arr) {
        	 System.out.print(a+" ");
         }
         
         for(int i=0;i<arr.length;i++) {
        	 if(ele==arr[i]) {
        		 for(int j=i;j<arr.length-1;j++) {
        			 arr[j]=arr[j+1];
        		 }
        		 break;
        	 }
         }
         System.out.println();
         
         System.out.println("Elements are::");
         for(int i=0;i<arr.length-1;i++) {
        	 System.out.print(" "+arr[i]);
         }
	}

}