package chap02;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int hour, minute, second;
		System.out.print("�� ���� ������ �Է��ϼ��� : ");
		second = in.nextInt();
		// �ʸ� 3600���� ���� ��
		hour = second / 3600;
		
				// �ʸ� 3600���� ���� �������� 60���� ���� ��
		minute = second % 3600 / 60;
		
		// �ʸ� 3600���� ���� �������� 60���� ���� ������
		second = second % 3600 % 60;      
        System.out.println(hour + "�� " + minute + "�� " 
		                    + second + "��");
	}

}
