package chap09;

import java.util.Calendar;

public class CalendarEx01 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		Calendar birth = Calendar.getInstance();
		
		birth.set(1991, 02, 21); // 월은 하나 빼고 넣음 왜냐? 월은 나중에 1더해줘야 하니까
		long re;
		re = (today.getTimeInMillis() - birth.getTimeInMillis()) / 1000 ;
		System.out.println(re / (24*60*60)); // 내가 산 날짜 며칠 살았는지..ㅋㅋ
        System.out.println(toString(today));
		
	}
	public static String toString(Calendar c) {
		return c.get(c.YEAR) + "년 " + (c.get(c.MONTH)+1) + "월 " + c.get(c.DATE) + "일" ;
	}

}
