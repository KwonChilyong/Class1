package chap03;

import java.util.Scanner;

public class Ex116p {

	public static void main(String[] args) {
		int result;
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("�� ���丮���� ���ұ��?");
		n = in.nextInt();

		result = 1;

// 1-1�� ����		
		while (n > 0) {
			result *= n;
			n--;

		}
		System.out.println(result);
// 1-2�� ����		
		while (true) {
			if (n < 1) {
				break;
			}
			result *= n;
			n--;
		}
		System.out.println(result);

// 2-1�� ����
		result = factorial(n);

		System.out.println(result);
		System.out.println(factorial(5));
		System.out.println(factorial(1, 5));
		System.out.println(factorial(3, 5));
		System.out.println(factorial(10, 5));
	}

	public static int factorial(int x) {
		int r = 1;
		while (x > 0) {
			r *= x;
			x--;

		}
		return r;

	}
//  3�� ����
	public static int factorial(int x, int y) {
		int r = 1;
		if (x < y) {
			while (y >= x) {
				r *= y;
				y--;

			}
		} 
			return r;

	}
}
