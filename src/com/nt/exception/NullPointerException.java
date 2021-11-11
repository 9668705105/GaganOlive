package com.nt.exception;

public class NullPointerException {
	
	
	/*
	 * NullPointerException is a runtime 
	 * exception and it is thrown when the application try to 
	 * use an object reference which has a null value.
	 */

	public static void main(String[] args) {
		
		NullPointerException n=new NullPointerException();
		try{
			Object ref = null;
	        ref.toString();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
