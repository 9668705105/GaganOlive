package com.nt.exception;

/*
 * System.exit is a void method. It takes an exit code, 
 * which it passes on to the calling  program.

Exiting with a code of zero means a normal exit:
 */

public class SystemExit {

	public static void main(String[] args) {

		try {
			int a = 10, b = 0, c;
			c = a / b;
			System.out.println(c);
		}

		catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		} finally {
			System.out.println("Exiting the program");
		}

	}

}
