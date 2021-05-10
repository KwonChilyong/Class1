package chap09;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarEx03 {

	public static void main(String[] args) {  // �Է¹��� ��,�� �޷¸����.
		Scanner in = new Scanner(System.in);
		int year;
		int month;
		System.out.println("�� ���� �Է��ϼ���.");
		year = in.nextInt();
		month = in.nextInt();
		
		Calendar cal = Calendar.getInstance();
		
		int start_day = 0;
		int end_day = 0;
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		
		sDay.set(year, month - 1, 1); // ���,���,1�� (���� ������)
		eDay.set(year, month, 1); // �Է��� ���� ������ 1�� �� ��(�������� ������) �ؿ� -1 �� ���ָ� �츮�� ���ϴ� �̹��� ������ �ȴ�.
		
		eDay.add(Calendar.DATE, -1); // -1�� ���� ������ �Ϸ� �������
		
		start_day = sDay.get(sDay.DAY_OF_WEEK); // �������� ���� (�Ͽ���=1)
		end_day = eDay.get(eDay.DATE); 
		
		System.out.println(" -- " + year + "�� "+ month + "�� --"  );
		System.out.printf("%3s%3s%3s%3s%3s%3s%3s\n","SU","MO","TU","WE","TH","FR","SA");
	
		for(int i = 1 ; i < start_day ; i++) {
			System.out.printf("%3s","");
		}
		for(int i = 1, n = start_day ; i <= end_day; i++, n++) {
			System.out.printf("%3d", i);
			if(n % 7 == 0) {
				System.out.println(); // �ٹٲ��ض� �� 1���� ������ �ٽ� �Ͽ��� ���� �����ϰԲ�
			}
		}
		
		
		
		
	}

}
