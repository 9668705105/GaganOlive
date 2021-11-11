package com.nt.oop;

public class AllStatic {
	  static int a;
	 
	static  boolean show(int b) {
		//show("hello");
		
		 System.out.println(a);
		 
		return true;
	 }
	static void show(String s) {
		System.out.println(s);
	}
	static {
		a=10;
		System.out.println("hiiii gagan");
	}
	static{
		System.out.println("try ur self");
	}

	public static void main(String[] args) {
		//AllStatic obj1=new AllStatic();
		System.out.print(AllStatic.show(5));
		

	}

}
