package chap03;

import java.util.Scanner;

public class SwitchEx01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("등수를 입력하세요");
		int rank = in.nextInt();
		
		switch(rank) {
		case 1:
			System.out.println("일등 입니다.");
			break;
		case 2:
			System.out.println("이등 입니다.");
			break;
		case 3:
			System.out.println("삼등 입니다.");
			break;
		default:
			System.out.println("등외 입니다.");
		}

	}

}
