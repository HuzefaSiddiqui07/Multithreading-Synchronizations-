package com.multithreading02.synchronizations;

public class MainAccountClass {

	public static void main(String[] args) {
		
		// Create an Object of AccountDetails Class
		AccountDetails accountDetails = new AccountDetails();
		
		// Create an object Thread Class 
		Thread thread1 = new Thread(accountDetails);
		Thread thread2 = new Thread(accountDetails);
		
		// Set Name by using Thread Class Object
		thread1.setName("Huzefa");
		thread1.setPriority(9);
		
		thread2.setName("Sujit");
		thread2.setPriority(10);
		
		
		
		// Use start() method use by using Thread Class Object
		thread1.start();
		thread2.start();

	}

}
