package chap03;

import java.util.Scanner;

public class SwitchEx03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���");
		int month = in.nextInt();
		System.out.println("���� �Է��ϼ���");
		int year = in.nextInt();
		int numDays = 0;
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			numDays = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			numDays = 30;
			break;
		case 2:
			if((year%4==0&&!(year%100==0))||year%400==0)
				numDays = 29;
			else
				numDays = 28;
			break;
			default:
				System.out.println("�߸��� �Է� �Դϴ�.");
		}
		System.out.println(year + "�� " + 
		             month + "���� " + numDays + "�Դϴ�.");

	}

}
