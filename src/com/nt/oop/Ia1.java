package com.nt.oop;

/*
 * Interface r similar to abstract class but all method in interface r abstract type.
 * Interface fully support Multiple Inheritance.
 * also used for loose Coupling
 * In Interface all method by default  public & abstract.
 * & if we create any variable inside interface by default it is public ,static,final
 */

 public interface Ia1  {
	default void eat() {
		
		System.out.println("apple");
	}

}
