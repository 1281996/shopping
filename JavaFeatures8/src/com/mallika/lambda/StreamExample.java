package com.mallika.lambda;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
public static void main(String args[]){
	LocalDate local=LocalDate.now();
	LocalDate local1=LocalDate.of(1997,8,12);
	System.out.println(local);
	System.out.println(local1.getDayOfMonth()+" -"+local1.getMonth());
	int year=local1.get(ChronoField.YEAR);
	int year1=local1.getYear();
	System.out.println(year1);
	System.out.println(year);
	LocalDateTime l1=LocalDateTime.of(1996,Month.AUGUST,12,16,18,23);
	LocalDate l2=l1.toLocalDate();
	System.out.println(l2);
	//LocalDateTime l3=l2.atTime(12,45,60);
	//System.out.println(l3);
	Duration d1=Duration.between(LocalTime.NOON,LocalTime.MIDNIGHT);
	System.out.println(d1);
}
}