package chap02;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num, sum;
		
		System.out.println("0~999 사이의 숫자를 입력하세요");
		num = in.nextInt();
		sum = num / 100 + (num % 100 / 10) + (num%10);
		System.out.println("각 자리수의 합은 : " + sum);

	}

}
