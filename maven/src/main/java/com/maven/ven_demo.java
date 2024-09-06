package com.maven;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.Seconds;
//we have to import joda-time depedency
public class ven_demo {

	public static void main(String[] args) throws InterruptedException {
   
    LocalDateTime dateTime1 = LocalDateTime.of(2024, 9, 6, 12, 0); // September 6, 2024, 12:00 PM
    LocalDateTime dateTime2 = LocalDateTime.of(2024, 10, 6, 13, 30); // September 6, 2024, 1:30 PM

    // Convert LocalDateTime to Date (if necessary)
    Date d1 = Date.from(dateTime1.atZone(ZoneId.systemDefault()).toInstant());
    Date d2 = Date.from(dateTime2.atZone(ZoneId.systemDefault()).toInstant());
    int seconds=Seconds.secondsBetween(new DateTime(d1), new DateTime(d2)).getSeconds();
    System.out.println(seconds);
	}

}
