package chap09;

import java.util.Date;

public class DateEx01 {
	public String toString(Date d) {
		return d.getYear() + "년" + (d.getMonth() + 1) + "월" + d.getDate() + "일" ; 
	}

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.getDate()); 
		System.out.println(d.getMonth() +1); // Month 는 -1 로 나옴
		System.out.println(d.getYear());
		System.out.println(d.getYear() + 1900); // 1900년 1월 1일이 1일이라고 지정해놨다. 컴퓨터 날짜로는 121년임
		System.out.println(d.getTime());
		
	}
	
}
