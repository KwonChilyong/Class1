package chap09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class RandomEx01 {

	public static void main(String[] args) {
		Random r = new Random();
		
		System.out.println(r.nextInt(99)+1); // 1���� 100���� �׳�(100) �̸� 0���� 100���� 
		
//		-------------------------------------------------------------SimpleDateFormat Ŭ����
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat f1 = new SimpleDateFormat("yyyy�� MM�� dd��");
		String s = f.format(new Date());
		System.out.println(s);
		String s1 = f1.format(new Date());
		System.out.println(s1);
		
		Calendar c = Calendar.getInstance();
		Date d = new Date(c.getTimeInMillis()); // Calendar Ÿ���� Date Ÿ������ �ٲٴ� ��� 
		
		Date date = new Date();
		c.setTime(date); // Date Ÿ���� Calendar Ÿ������ ��ȯ
		
		System.out.println(f.format(d));
		
		
	}

}
