package com.ibm.thread;

public class Application {
	public static void main(String[] args) {
		Thread t1 = new Worker();
		t1.start();
		System.out.println("in main thread");
	}

}
