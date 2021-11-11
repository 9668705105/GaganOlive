package com.nt.multithreading;

public class MyThread implements Runnable {
	public void run() {
		try {
		int div=50/0;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Running.......");
	}

	public static void main(String[] args) {
		MyThread m=new MyThread();
		Thread t=new Thread(m);
		t.start();

	}

}
