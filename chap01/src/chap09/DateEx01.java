package chap09;

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
		
	}
	
}
