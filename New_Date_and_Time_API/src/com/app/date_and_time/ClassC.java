package com.app.date_and_time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ClassC {

	void meth1()
	{
		System.out.println("----------Zone ID------------------");
		for(String z:ZoneId.getAvailableZoneIds())
			System.out.println(z);
	}
	public static void main(String[] args) {
		System.out.println(LocalDate.now()); //YYYY-MM-DD
		System.out.println(LocalTime.now()); //HH:MM:SS.ms
		System.out.println(ZonedDateTime.now()); //2023-02-12T15:10:29.930369100+05:30[Asia/Calcutta]
		System.out.println(LocalTime.now(ZoneId.of("America/North_Dakota/New_Salem")));
		
		//get Zone ids
		new ClassC().meth1();
	}

}
