package com.nt.oop;

public interface GrandFather {
	default void eat() {
		System.out.println("grapes");
	}

}
