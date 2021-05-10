package chap09;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarEx03 {

	public static void main(String[] args) {  // 입력받은 년,월 달력만들기.
		Scanner in = new Scanner(System.in);
		int year;
		int month;
		System.out.println("년 월을 입력하세요.");
		year = in.nextInt();
		month = in.nextInt();
		
		Calendar cal = Calendar.getInstance();
		
		int start_day = 0;
		int end_day = 0;
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		
		sDay.set(year, month - 1, 1); // 몇년,몇월,1일 (월의 시작일)
		eDay.set(year, month, 1); // 입력한 월에 다음달 1일 이 됨(다음월의 시작일) 밑에 -1 을 해주면 우리가 원하는 이번달 말일이 된다.
		
		eDay.add(Calendar.DATE, -1); // -1이 월의 마지막 일로 만들어줌
		
		start_day = sDay.get(sDay.DAY_OF_WEEK); // 시작일의 요일 (일요일=1)
		end_day = eDay.get(eDay.DATE); 
		
		System.out.println(" -- " + year + "년 "+ month + "월 --"  );
		System.out.printf("%3s%3s%3s%3s%3s%3s%3s\n","SU","MO","TU","WE","TH","FR","SA");
	
		for(int i = 1 ; i < start_day ; i++) {
			System.out.printf("%3s","");
		}
		for(int i = 1, n = start_day ; i <= end_day; i++, n++) {
			System.out.printf("%3d", i);
			if(n % 7 == 0) {
				System.out.println(); // 줄바꿈해라 즉 1주일 지나고 다시 일요일 부터 시작하게끔
			}
		}
		
		
		
		
	}

}
