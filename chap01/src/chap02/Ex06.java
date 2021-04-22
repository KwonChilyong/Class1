package chap02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("국어, 영어, 수학 점수를 입력 하세요.");
		int kor = in.nextInt();
		int eng = in.nextInt();
		int mat = in.nextInt();
		
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);

	}

}
