package chap05;

import java.util.Scanner;

public class ArrayForEx01 {

	public static void main(String[] args) {
		// ���� 5���� �Է¹޾� �հ踦 ���
		Scanner in = new Scanner(System.in);
		int score[] = new int[5];
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			System.out.println("������ �Է��ϼ���.");
			score[i] = in.nextInt();
			sum += score[i];
		}
//		for(int i = 0; i < 5; i++) {
//			sum += score[i];
//		}
		System.out.println("Total : " + sum);
	}

}
