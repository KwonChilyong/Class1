package chap09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class RandomEx01 {

	public static void main(String[] args) {
		Random r = new Random();
		
		System.out.println(r.nextInt(99)+1); // 1부터 100까지 그냥(100) 이면 0부터 100까지 
		
//		-------------------------------------------------------------SimpleDateFormat 클래스
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat f1 = new SimpleDateFormat("yyyy년 MM월 dd일");
		String s = f.format(new Date());
		System.out.println(s);
		String s1 = f1.format(new Date());
		System.out.println(s1);
		
		Calendar c = Calendar.getInstance();
		Date d = new Date(c.getTimeInMillis()); // Calendar 타입을 Date 타입으로 바꾸는 방법 
		
		Date date = new Date();
		c.setTime(date); // Date 타입을 Calendar 타입으로 변환
		
		System.out.println(f.format(d));
		
		
	}

}
