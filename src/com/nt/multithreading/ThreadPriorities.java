package com.nt.multithreading;

public class ThreadPriorities  extends Thread{
	public void run() {
		System.out.println("Child thread");
		System.out.println("Child Thread Priorities "+Thread.currentThread().getPriority());
	}
	

	public static void main(String[] args) {
		System.out.println("Main thread first priorities always by default:"+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(8);
		System.out.println("Main thread after change priorities:"+Thread.currentThread().getPriority());
		
		ThreadPriorities tp=new ThreadPriorities();
		tp.start();

	}

}
