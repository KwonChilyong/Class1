package chap02;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		double w, h , area;
		Scanner in = new Scanner(System.in);
		System.out.print("���簢���� ���� ���̸� �Է��ϼ��� : ");
		w = in.nextDouble();
		System.out.print("���簢���� ���� ���̸� �Է��ϼ��� : ");
		h = in.nextDouble();
		area = w * h;
		System.out.println("���簢���� ���̴� " + area + "�Դϴ�");
		double d1, d2, d3;
		d1 = 10.34;
		d2 = 4.78;
		d3 = d1 % d2;
		
		System.out.println(d3);
		
		int x = 1, y = 2;
		System.out.println(x++);
		System.out.println(++x + y--);
		System.out.println(++x / 3 + x * ++y);
	}

}
