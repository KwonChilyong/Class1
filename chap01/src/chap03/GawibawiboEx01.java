package chap03;

import java.util.Scanner;

public class GawibawiboEx01 {

	public static void main(String[] args) {
//		����, ����, �� ����
//		���� : 1, ���� : 2, �� : 3
		Scanner in = new Scanner(System.in);
		int user, com, result;

		com = (int) (Math.random() * 3) + 1;
		System.out.println("����:1, ����:2, ��:3 �� �Է� :");
		user = in.nextInt();

		result = user - com;

		if (result == -2 || result == 1) {
			System.out.println("�̰��!!!!");
		} else if (result == 0) {
			System.out.println("����!!!!");
		} else {
			System.out.println("����!!!!");
		}

	}

}
