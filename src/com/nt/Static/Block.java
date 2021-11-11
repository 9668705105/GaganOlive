package com.nt.Static;

public class Block {
	static {
		System.out.println("first static block");
	}
	void display() {
		System.out.println("Non Static block");
	}

	public static void main(String[] args) {
		System.out.println("it is main block");
		Block b=new Block();
		b.display();

	}
	static {
		System.out.println("Second static block");
	}
	
	

}
