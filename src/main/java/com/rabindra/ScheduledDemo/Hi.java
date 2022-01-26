package com.rabindra.ScheduledDemo;

public class Hi extends Thread{

public void run() {
		
		for(int i=1; i<=3; i++) {
			System.out.println("Hi");
			
			try{
				Thread.sleep(1000);
			}catch(Exception exc) {
				
			}
		}
	}
}
