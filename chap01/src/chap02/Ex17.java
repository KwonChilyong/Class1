package chap02;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x;
		System.out.println("������ �Է��ϼ���");
		x = in.nextInt();
		System.out.println("���� "+ x 
				      + "�� 4�� ���������� x % 4 == 0�� "
				      + (x % 4 == 0) + "�̴�.");
		
		System.out.println("���� "+ x 
			      + "�� 5�� ���������� x % 5 == 0�� "
			      + (x % 5 == 0) + "�̴�.");
		System.out.println("���� "+ x 
		+ "�� 4 �Ǵ� 5�� ���������� x % 4 == 0 || x % 5 == 0�� "
			      + (x % 4 == 0 || x % 5 == 0) + "�̴�.");
		
		System.out.println("���� "+ x 
				+ "�� 4 �׸��� 5�� ���������� x % 4 == 0 && x % 5 == 0�� "
					      + (x % 4 == 0 && x % 5 == 0) + "�̴�.");
	}

	
}
