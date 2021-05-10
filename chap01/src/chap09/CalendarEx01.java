package chap09;

import java.util.Calendar;

public class CalendarEx01 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		Calendar birth = Calendar.getInstance();
		
		birth.set(1991, 02, 21); // ���� �ϳ� ���� ���� �ֳ�? ���� ���߿� 1������� �ϴϱ�
		long re;
		re = (today.getTimeInMillis() - birth.getTimeInMillis()) / 1000 ;
		System.out.println(re / (24*60*60)); // ���� �� ��¥ ��ĥ ��Ҵ���..����
        System.out.println(toString(today));
		
	}
	public static String toString(Calendar c) {
		return c.get(c.YEAR) + "�� " + (c.get(c.MONTH)+1) + "�� " + c.get(c.DATE) + "��" ;
	}

}
