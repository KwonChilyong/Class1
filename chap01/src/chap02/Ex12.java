package chap02;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num;
		num = in.nextInt();
		System.out.println(num + "제곱은 " + num * num);

	}

}
