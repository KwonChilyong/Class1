package chap02;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x, y, z;
		System.out.print("���� �̼� ���� : ");
		x = in.nextInt();
		System.out.print("���� �̼� ���� : ");
		y = in.nextInt();
		System.out.print("�Ϲ� �̼� ���� : ");
		z = in.nextInt();
		
		System.out.println
		((x+y+z >= 140 && x >=70 &&((y >= 30 && z >= 30)
		  || (y+z) >= 80)) ? "���� ����" : "���� �Ұ���");
		
		String r = (x+y+z >= 140 && x >=70 &&((y >= 30 && z >= 30)
				  || (y+z) >= 80)) ? "���� ����" : "���� �Ұ���";
		
		if((x+y+z >= 140 && x >=70 &&((y >= 30 && z >= 30)
		  || (y+z) >= 80)))
			System.out.println("���� ����");
		else
			System.out.println("���� ����");
	}

}
