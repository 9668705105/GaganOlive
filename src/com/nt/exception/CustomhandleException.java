package com.nt.exception;

class Voting extends RuntimeException{
	Voting(String msg){
		super(msg);
	}
}

public class CustomhandleException  {
	public static void main(String[] args) {
		int age=16;
		if(age<18) {
			throw new Voting("U r not eligible for voting");
		}
		else
			System.out.println("Please vote here");

	}

}
