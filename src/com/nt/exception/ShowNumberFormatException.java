package com.nt.exception;

/*
 * The NumberFormatException is thrown when we try to convert
 *  a string into a numeric value such as float or integer
 */

public class ShowNumberFormatException {

	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(null);
			System.out.println(a);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
