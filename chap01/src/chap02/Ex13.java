package chap02;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int r, h;
		double area;
		
		System.out.print("������� �ظ� ��������? ");
		r = in.nextInt();
		
		System.out.print("������� ���̴�? ");
		h = in.nextInt();
		
		area = r * r * h * 3.14;
		
		System.out.println("������� ���Ǵ� : " + area);
		
		
		

	}

}
