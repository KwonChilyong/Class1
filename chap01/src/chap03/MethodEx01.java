package chap03;

import java.util.Scanner;

public class MethodEx01 {

	public static void main(String[] args) {
		int i, j;
		System.out.println("정수를 입력하시오(두 개).");
		
		Scanner in = new Scanner(System.in);
		i = in.nextInt();
		j = in.nextInt();
		
		System.out.println("합은 " + sum(i,j));

	}

	public static int sum(int x, int y) {
		
		return x + y;
	}

}
