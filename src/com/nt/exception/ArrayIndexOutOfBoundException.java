package com.nt.exception;

public class ArrayIndexOutOfBoundException {

	public static void main(String[] args) {
		try {
			String[] arr = {"Bisu","Silu","basu","fitu"};   
			//Declaring 4 elements in the String array                                       
			          
			  for(int i=0;i<=arr.length;i++)      
			  
			//Here, no element is present at the iteration number arr.length, i.e 4  
			             System.out.println(arr[i]);      
			//So it will throw ArrayIndexOutOfBoundException at iteration 4  
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
