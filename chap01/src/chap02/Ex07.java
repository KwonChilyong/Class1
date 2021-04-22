package chap02;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("반지름을 입력하세요.");
		
		double r;
		r = in.nextDouble();
//		double r = in.nextDouble();
		System.out.println("원의 넓이는 : " + (r*r*3.14));
		

	}

}
