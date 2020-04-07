package org.comstudy21.ch06;

import java.util.Calendar;

public class ch06Ex12 {

	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		date.clear();
		date.set(2021,11,15);
//		date.set(Calendar.YEAR, 2020);
//		date.set(Calendar.MONTH, 11);
//		date.set(Calendar.DATE, 25);
		System.out.println("약속 날짜는 "+date.get(Calendar.YEAR)+"년 "+
		(date.get(Calendar.MONTH)+1)+"월 "+date.get(Calendar.DATE)+"일");
		

	}

}
