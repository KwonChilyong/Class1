package chap02;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x;
		System.out.println("정수를 입력하세요");
		x = in.nextInt();
		System.out.println("정수 "+ x 
				      + "가 4로 나누어지면 x % 4 == 0은 "
				      + (x % 4 == 0) + "이다.");
		
		System.out.println("정수 "+ x 
			      + "가 5로 나누어지면 x % 5 == 0은 "
			      + (x % 5 == 0) + "이다.");
		System.out.println("정수 "+ x 
		+ "가 4 또는 5로 나누어지면 x % 4 == 0 || x % 5 == 0은 "
			      + (x % 4 == 0 || x % 5 == 0) + "이다.");
		
		System.out.println("정수 "+ x 
				+ "가 4 그리고 5로 나누어지면 x % 4 == 0 && x % 5 == 0은 "
					      + (x % 4 == 0 && x % 5 == 0) + "이다.");
	}

	
}
