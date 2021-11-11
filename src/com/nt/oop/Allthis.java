package com.nt.oop;

public class Allthis {
	int a=10;
	Allthis(){
		this(5);
		System.out.println("no arg constructor");
	}
	Allthis(int a){
		System.out.println("parameterised construvtor");
		
	}
	
	void display() {
		System.out.println(this.a);
		
	}
	
	void show() {
		System.out.println("hiii i am from show method");
		this.display();
		
	}

	public static void main(String[] args) {
		Allthis obj1=new Allthis();
		obj1.show();
		

	}

}
