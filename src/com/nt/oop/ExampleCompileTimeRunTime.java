package com.nt.oop;

 class ExampleCompileTimeRunTime {
	void show(int a,int b) {
		System.out.println("CompileTime Polymorphisim");
	}
	void show(int a) {
		System.out.println("hello");
	}
	
 static class Test extends ExampleCompileTimeRunTime{
	@Override
	void show(int a) {
		System.out.println("Runtime Polymorphisim");
	}


public static void main(String[] args) {
		ExampleCompileTimeRunTime cr=new ExampleCompileTimeRunTime();
		cr.show(10,60);
		Test t=new Test();
		t.show(5);

	}

}
 }
