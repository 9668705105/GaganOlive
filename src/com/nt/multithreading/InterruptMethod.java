package com.nt.multithreading;

//Interrupt() method will only works when the thread is in sleeping or waiting state
public class InterruptMethod extends Thread {
	public void run() {
		try {
			for(int i=1;i<=6;i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e) {
			System.out.println("Thread is interrupted"+e);
			System.out.println(Thread.interrupted());
		}
	}

	public static void main(String[] args) {
		InterruptMethod obj=new InterruptMethod();
		obj.start();
		obj.interrupt();
		

	}

}
