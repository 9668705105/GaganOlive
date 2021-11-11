package com.nt.oop;

abstract class Car{  
	  abstract void run();  
	}  
	public class Kia extends Car{  
	void run(){
		System.out.println("Luxirious car currently in low budget");
	}  
	
	
public static void main(String args[]){  
	 Kia obj = new Kia();  
	 obj.run();
	 
	 
	}  
}  