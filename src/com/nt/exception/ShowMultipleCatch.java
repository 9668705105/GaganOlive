package com.nt.exception;



public class ShowMultipleCatch {

	public static void main(String[] args) {
		try {
			int a=10,b=0,c;
			c=a/b;
			System.out.println(c);
			  
		}
		catch(ArithmeticException a) {
			System.out.println(a);
			
		}   
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
