package chap02;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
//		System.out.println("���ڸ� �Է� �ϼ���");
//		int num = in.nextInt();
//		int re;
//		String y;
//		re = num % 2; 
//		y = (re == 0) ? "¦��" : "Ȧ��";
//		System.out.println("�Է��� ���ڴ� : " + y);
//		System.out.println("---- ���������� ------");
//		
		int x, k;
		x = 0;
		k = ++x;  // x = x + 1;
				  // k = x;

		k = x++;  // k = x;
		          // x = x + 1;
		
		int z;
		z = 0;
		
		k = --z; // z = z - 1;
		         // k = z;
		
		x = 10;
		z = 10;
		k = 0;
		
		k = ++x + z--;
		System.out.println("k : " + k);
		System.out.println("x : " + x);
		System.out.println("z : " + z);
		
		
		
		
	}

}
