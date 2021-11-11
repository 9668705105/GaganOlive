package com.nt.multithreading;

//Inter-thread communication is a mechanism in which a thread releases the lock and enter into paused state and another 
//thread acquires the lock & continue to executed
public class InterThreadCommunication extends Thread {
	int total=0;
	public void run() {
		synchronized(this) {
			try {
			for(int i=1;i<=10;i++) {
				total=total+100;
				System.out.println(total);
				Thread.sleep(1000);
				
			}
			}
			catch(Exception e) {
				System.out.println(e);
			}
			this.notify();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		InterThreadCommunication it=new InterThreadCommunication();
		it.start();
		synchronized(it) {
			it.wait();
			System.out.println("Total earnings:-"+it.total);
		}
		

	}

}
