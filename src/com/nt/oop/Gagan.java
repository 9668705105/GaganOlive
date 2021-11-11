package com.nt.oop;

 
public class Gagan {
	
	Gagan(int a){
		System.out.println("I am from parameterised constructor");
	}
	Gagan(){
		super();
		System.out.println("I am no arg constructor");
	}

	public static void main(String[] args) {
		Gagan obj1=new Gagan();
		//obj1.show();
		

	}

}
