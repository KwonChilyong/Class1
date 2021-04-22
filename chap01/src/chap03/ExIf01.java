package chap03;

import java.util.Scanner;

public class ExIf01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int score;
		String grade;
		System.out.println("점수를 입력하세요");
		score = in.nextInt();
		if(score >= 90)
			if(score >= 95)
				grade = "A+";
			else
				grade = "A-";
		else if(score >= 80)
			grade = "B";
		else if(score >= 70)
			grade = "C";
		else if(score >= 60)
			grade = "D";
		else
			grade = "F";
		System.out.println("당신의 학점은 : " + grade);
	}

}
