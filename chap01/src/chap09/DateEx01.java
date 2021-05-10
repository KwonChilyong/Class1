package chap09;

import java.util.Calendar;
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
		
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		System.out.println(c.get(c.YEAR)); 
		System.out.println(c.get(Calendar.YEAR)); // 바로 calendar 로 불러내도 상관없다. 
		System.out.println(c.get(Calendar.MONTH)+1); // 0월부터 ~11월 까지라 +1 을 해줘야 함
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.WEEK_OF_YEAR)); // 올해중에 지금이 몇번째 주 인지 나오는것.
		System.out.println(c.get(Calendar.WEEK_OF_MONTH)); // 이번달에 몇번째 주인지 나옴
		System.out.println(c.get(Calendar.DAY_OF_MONTH)); // DATE 랑 같다. 이번달 며칠째인지
		System.out.println(c.get(Calendar.DAY_OF_WEEK)); // 요일임.. 월요일이면 2나옴 1은 일요일 화요일이면 3 . . . .
		System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH)); // 위랑 똑같은듯?
		
		
		
	}
	
}
