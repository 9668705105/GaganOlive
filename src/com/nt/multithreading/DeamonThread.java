package com.nt.multithreading;

public class DeamonThread extends Thread {
	// DeamonThread is that which run backside of another thread

	// Checking whether the thread is Daemon or not
	public void run() {
		// Checking whether the thread is Daemon or not
		if (Thread.currentThread().isDaemon()) {
			System.out.println(Thread.currentThread().getName() + " is Daemon thread");
		}

		else {
			System.out.println(Thread.currentThread().getName() + " is User thread");
		}
	}

	public static void main(String[] args) {
		DeamonThread t1 = new DeamonThread();
		DeamonThread t2 = new DeamonThread();
		DeamonThread t3 = new DeamonThread();

		// Setting user thread t1 to Daemon
		t1.setDaemon(true);

		// starting first 2 threads
		t1.start();
		t2.start();

		// Setting user thread t3 to Daemon
		t3.setDaemon(true);
		t3.start();

	}

}
