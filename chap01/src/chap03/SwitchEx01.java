package chap03;

import java.util.Scanner;

public class SwitchEx01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("����� �Է��ϼ���");
		int rank = in.nextInt();
		
		switch(rank) {
		case 1:
			System.out.println("�ϵ� �Դϴ�.");
			break;
		case 2:
			System.out.println("�̵� �Դϴ�.");
			break;
		case 3:
			System.out.println("��� �Դϴ�.");
			break;
		default:
			System.out.println("��� �Դϴ�.");
		}

	}

}