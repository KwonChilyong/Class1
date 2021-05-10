package chap09;

import java.util.Calendar;

public class CalendarEx02 {
	public static String toString(Calendar c) {
		return c.get(c.YEAR) + "�� " + (c.get(c.MONTH)+1) + "�� " + c.get(c.DATE) + "��" ;
	}
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		date.set(1991, 02, 21);
		System.out.println("������� : " + toString(date));
		System.out.print("20�� �� ");
		date.add(Calendar.MONTH, 240); // 20�� �Ĵϱ� 20��*12���� �ؼ� 240���� ������ 
		System.out.println("������� : " + toString(date));
		
//		date.roll(Calendar.DATE, 20); 
//		System.out.println("������� : " + toString(date));
		
		date.add(Calendar.DATE, 20); // ��¥�� ���Ҷ��� add�� ����.
		System.out.println("������� : " + toString(date));
	}

}
