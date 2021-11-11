package com.nt.oop;
/*
 * the interface which has only one abstract method is called funcational interface
 * ()->{body}
 * first bracket is argument list() then array token-> then we write some body
 */

interface CreateShow{
	//int add(int a,int b);
	String show(String a);
}

public class LamdaExpression {

	public static void main(String[] args) {
		//addition ad=(a,b)->(a*b);
		CreateShow ds=(s)->{
			return "" +s;
		};
		System.out.println(ds.show("Haii Olive Crypto"));
		
		//System.out.println("Multiplication result is:"+ad.add(5, 6));
		

	}

}
