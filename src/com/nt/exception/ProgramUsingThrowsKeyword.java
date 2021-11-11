package com.nt.exception;

public class ProgramUsingThrowsKeyword {
	void result() throws ArithmeticException{
		int a=10,b=0,c;
		c=a/b;
		
	}

	public static void main(String[] args) {
		ProgramUsingThrowsKeyword th=new ProgramUsingThrowsKeyword();
		th.result();

	}

}
