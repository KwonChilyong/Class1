package chap02;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int f;
		double c;
		System.out.println("ȭ�� �µ��� �Է��ϼ���");
		f = in.nextInt();
		c = 5.0/9*(f-32);
		System.out.println("ȭ�� " + f + "�� ���� " + c + "�̴�");
		System.out.printf("ȭ�� %d �� ���� %5.2f�̴�\n", f, c);
	}

}
