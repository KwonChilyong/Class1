package chap09;

import java.util.Calendar;

public class CalendarEx02 {
	public static String toString(Calendar c) {
		return c.get(c.YEAR) + "년 " + (c.get(c.MONTH)+1) + "월 " + c.get(c.DATE) + "일" ;
	}
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		date.set(1991, 02, 21);
		System.out.println("생년월일 : " + toString(date));
		System.out.print("20년 후 ");
		date.add(Calendar.MONTH, 240); // 20년 후니까 20년*12개월 해서 240개월 쓴거임 
		System.out.println("생년월일 : " + toString(date));
		
//		date.roll(Calendar.DATE, 20); 
//		System.out.println("생년월일 : " + toString(date));
		
		date.add(Calendar.DATE, 20); // 날짜를 더할때는 add를 쓴다.
		System.out.println("생년월일 : " + toString(date));
	}

}
