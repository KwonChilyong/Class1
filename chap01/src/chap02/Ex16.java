package chap02;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int f;
		double c;
		System.out.println("È­¾¾ ¿Âµµ¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
		f = in.nextInt();
		c = 5.0/9*(f-32);
		System.out.println("È­¾¾ " + f + "´Â ¼·¾¾ " + c + "ÀÌ´Ù");
		System.out.printf("È­¾¾ %d ´Â ¼·¾¾ %5.2fÀÌ´Ù\n", f, c);
	}

}
