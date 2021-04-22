package chap03;

import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("차량 뒷 번호를 입력하세요");
		int number = in.nextInt();
		
		switch(number % 5) {
		case 0:
			System.out.println("월요일");
			break;
		case 1:
			System.out.println("화요일");
			break;
		case 2:
			System.out.println("수요일");
			break;
		case 3:
			System.out.println("목요일");
			break;
			
		default:
			System.out.println("금요일");
		}


	}

}
