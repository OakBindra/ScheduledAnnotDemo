package com.rabindra.ScheduledDemo;

public class MultithreadingPractice {

	public static void main(String[] args) {

		Hi obj1 = new Hi();
		
		Hello obj2 = new Hello();
		
		obj1.start();
		
		try{
			Thread.sleep(20);
		}catch(Exception e) {
			
		}
		
		obj2.start();
		
//		obj1.run();
//		obj2.run();
	}

}
