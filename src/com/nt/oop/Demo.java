package com.nt.oop;

public class Demo extends ExampleCompileTimeRunTime {
	void show(int a) {
		System.out.println("I am from demo class");
	}
	public static void main(String[] args) {
		ExampleCompileTimeRunTime obj1=new ExampleCompileTimeRunTime();
		obj1.show(4,5);
		Demo obj2=new Demo();
		obj2.show(6);
	}

}
