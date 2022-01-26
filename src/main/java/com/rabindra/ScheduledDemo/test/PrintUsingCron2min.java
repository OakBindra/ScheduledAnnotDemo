package com.rabindra.ScheduledDemo.test;

import java.util.Date;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
public class PrintUsingCron2min {

	@Scheduled(cron = "0 */2 * * * *")
	public void scheduleTaskUsingCronExpression() {

		
	   String name= "Rabindra";

	    System.out.println(
	  	      "My NAME IS - " + name.toUpperCase()  +" And date :" +new Date());
	}
	
	
}
