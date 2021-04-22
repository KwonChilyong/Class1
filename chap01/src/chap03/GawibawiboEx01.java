package chap03;

import java.util.Scanner;

public class GawibawiboEx01 {

	public static void main(String[] args) {
//		가위, 바위, 보 게임
//		가위 : 1, 바위 : 2, 보 : 3
		Scanner in = new Scanner(System.in);
		int user, com, result;

		com = (int) (Math.random() * 3) + 1;
		System.out.println("가위:1, 바위:2, 보:3 중 입력 :");
		user = in.nextInt();

		result = user - com;

		if (result == -2 || result == 1) {
			System.out.println("이겼다!!!!");
		} else if (result == 0) {
			System.out.println("비겼다!!!!");
		} else {
			System.out.println("졌다!!!!");
		}

	}

}
