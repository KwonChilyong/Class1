package chap05;

import java.util.Scanner;

public class ArrayForEx01 {

	public static void main(String[] args) {
		// 점수 5개를 입력받아 합계를 출력
		Scanner in = new Scanner(System.in);
		int score[] = new int[5];
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			System.out.println("점수를 입력하세요.");
			score[i] = in.nextInt();
			sum += score[i];
		}
//		for(int i = 0; i < 5; i++) {
//			sum += score[i];
//		}
		System.out.println("Total : " + sum);
	}

}
