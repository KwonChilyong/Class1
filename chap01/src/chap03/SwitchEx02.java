package chap03;

import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("���� �� ��ȣ�� �Է��ϼ���");
		int number = in.nextInt();
		
		switch(number % 5) {
		case 0:
			System.out.println("������");
			break;
		case 1:
			System.out.println("ȭ����");
			break;
		case 2:
			System.out.println("������");
			break;
		case 3:
			System.out.println("�����");
			break;
			
		default:
			System.out.println("�ݿ���");
		}


	}

}
