package com.nt.multithreading;

class MedicalTest extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+"  "+i);
		}
		System.out.println("-------------------------------------------");
		try {
			System.out.println("Medical Test started");
			Thread.sleep(1000);
			System.out.println("Medical test Completed");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}

class DrivingTest extends Thread{
	public void run() {
		try {
			System.out.println("Driving Test started");
			Thread.sleep(1000);
			System.out.println("Driving test Completed");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}

public class LicenseDemo {

	public static void main(String[] args) throws InterruptedException {
		
		MedicalTest t1=new MedicalTest();
		t1.start();
		t1.join();
		
		DrivingTest t2=new DrivingTest();
		t2.start();
		t2.join();
		System.out.println("---------------------------------");
		
		for(int i=1;i<=6;i++) {
			Thread.yield();
			System.out.println(Thread.currentThread().getName()+"  "+i);
		}

	}

}
