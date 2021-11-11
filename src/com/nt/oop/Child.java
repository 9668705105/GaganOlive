package com.nt.oop;

public class Child implements Ia1,GrandFather ,Ia2{
	
	@Override
	public void eat() {
		GrandFather.super.eat();
		Ia1.super.eat();
		Ia2.super.eat();
	}
	
	public static void main(String[] args) {
		Child ch=new Child();
		ch.eat();	

	}

	

	

}
