//package com.rabindra.ScheduledDemo.test;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.TimeZone;
//
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//@Component
//public class ScheduledUsingCron {
//
//	@Scheduled(cron = "0 45/2 12 * * *", zone = "IST")
//	public void scheduleTaskUsingCronExpression() {
////		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
////	    Date now = new Date();
////	    String strDate = sdf.format(now);
//		
//		 // create a simple date format instance
//	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 'T' HH:mm:ss");
//	    // get the time zone of India country
//	    TimeZone India = TimeZone.getTimeZone("IST");
//	    // set the time zone to the date format
//	    sdf.setTimeZone(India);
//	    // print the date to the console
//	    System.err.println();
//		
//	   String name= "rabindra";
////	    System.out.println("MU NAME IS - " + name  +" And date :" +new Date());
//	    System.out.println(
//	  	      "MU NAME IS - " + name  +" And date :" +sdf.format(new Date()));
//	}
//}
