package com.nt.exception;

public class getMessagePrintStackTracetoString {

	public static void main(String[] args) {
		try {
			int a=10,b=0,c;
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			//e.printStackTrace(); //it shows Exception name,Description,Stacktrace
			//System.out.println(e.toString()); // it shows only Exception name and description
			//System.out.println(e.getMessage());;
		}

	}

}
