package com.rabindra.ScheduledDemo.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledWithCronForNPT {

	@Scheduled(cron = "0 0 19 * * *")
	public void scheduleTaskUsingCronExpression() {
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
//	    Date now = new Date();
//	    String strDate = sdf.format(now);
		
		 // create a simple date format instance
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 'T' HH:mm:ss");
	    // get the time zone of Nepal country
	    TimeZone Nepal = TimeZone.getTimeZone("Asia/Kathmandu");
	    // set the time zone to the date format
	    sdf.setTimeZone(Nepal);
	    
		
	   String name= "Rabindra";
	    System.out.println(
	  	      "MU NAME IS - " + name  +" And Date :" +sdf.format(new Date()));
	}
}
