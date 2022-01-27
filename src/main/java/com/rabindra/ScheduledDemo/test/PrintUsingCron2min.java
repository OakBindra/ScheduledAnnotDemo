package com.rabindra.ScheduledDemo.test;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class PrintUsingCron2min {

	private String name ="Rabindra";

	
	@Scheduled(cron = "0 */2 * * * *")
	public void scheduleTaskUsingCronExpression() {
		
		
		
		System.out.println("My name is " + name.toUpperCase() +" :And Date ->"+new Date());

	}
	
}

//@RestController
//@RequestMapping("/")
//public class PrintUsingCron2min {
//	
//	@Value("${student.name}")
//	
////	here if i user user.name and try to return it it shows my system name and doesnot take value from properties
//	private String userName;
//
//	@GetMapping
//	public String welcome() {
//		return "Welcome to "+ userName +" :And Date  "+ new Date();
//	}
//}
