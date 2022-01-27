package com.rabindra.ScheduledDemo.test;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
//@Configuration
@Component
public class PrintUsingCron1MinProfiles {

	
	@Value("${student.name}")
	private String userName;
	
	@Scheduled(cron = "0 * * * * *")
	public void scheduleTaskUsingCronExpression() {
		
		System.out.println("My name is " + userName +" :And Date ->"+new Date());

	}
	
}


