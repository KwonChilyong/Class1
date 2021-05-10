package chap09;

import java.util.Calendar;
import java.util.Date;

public class DateEx01 {
	public String toString(Date d) {
		return d.getYear() + "��" + (d.getMonth() + 1) + "��" + d.getDate() + "��" ; 
	}

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.getDate()); 
		System.out.println(d.getMonth() +1); // Month �� -1 �� ����
		System.out.println(d.getYear());
		System.out.println(d.getYear() + 1900); // 1900�� 1�� 1���� 1���̶�� �����س���. ��ǻ�� ��¥�δ� 121����
		System.out.println(d.getTime());
		
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		System.out.println(c.get(c.YEAR)); 
		System.out.println(c.get(Calendar.YEAR)); // �ٷ� calendar �� �ҷ����� �������. 
		System.out.println(c.get(Calendar.MONTH)+1); // 0������ ~11�� ������ +1 �� ����� ��
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.WEEK_OF_YEAR)); // �����߿� ������ ���° �� ���� �����°�.
		System.out.println(c.get(Calendar.WEEK_OF_MONTH)); // �̹��޿� ���° ������ ����
		System.out.println(c.get(Calendar.DAY_OF_MONTH)); // DATE �� ����. �̹��� ��ĥ°����
		System.out.println(c.get(Calendar.DAY_OF_WEEK)); // ������.. �������̸� 2���� 1�� �Ͽ��� ȭ�����̸� 3 . . . .
		System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH)); // ���� �Ȱ�����?
		
		
		
	}
	
}
