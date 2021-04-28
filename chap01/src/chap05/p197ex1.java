//package chap05;
//
//import java.util.Scanner;
//
//public class p197ex1 {
//
//	public static void main(String[] args) {
//		int numOfStudents = 0;
//		int[] scores;
//		
//		Scanner in = new Scanner(System.in);
//		System.out.println("학생 수를 입력하시오.");
//		numOfStudents = in.nextInt();
//		scores = new int[numOfStudents]; // 학생 수 만큼 만듦
//		
//		System.out.println(numOfStudents + "명의 점수를 입력하시오.");
//		
//		for(int i = 0 ; i < numOfStudents ; i++) {
//			scores[i] = in.nextInt();
//		}
//		
//		System.out.println(numOfStudents + "명의 학생 성적은 다음과 같다.");
//		for(int i = 0 ; i < numOfStudents ; i++) {
//			System.out.println(scores[i] + " ");
//		}
//		
//		
//		
//
//	}
//
//}   197 - 1번
package chap05;

import java.util.Scanner;

public class p197ex1 {

	public static void main(String[] args) {
		
//		int[][] a = {{0},{1,2},{3,4,5}};
//		
////		int[][] a1;
////		
////		a1 = new int[3][];  // 열의 개수 가변
////		a1[0] = new int[1];
////		a1[1] = new int[2];
////		a1[2] = new int[3];
//		
//		
////		int cnt = 0;
////		for(int i = 0; i < 3 ; i++) {
////			for(int j = 0; j <= i ; j++) {
////				a1[i][j] = cnt++; 
////			}
////		}   43~54 여기까지  // int[][] a = {{0},{1,2},{3,4,5}}; 랑 같다
//		for(int i = 0; i < 3 ; i++) {
//			for(int j = 0; j <= i ; j++) {
//				System.out.printf("%2d",a1[i][j]);
//			}
//			System.out.println();
//		}
//		p201 9번 문제 
		
		
		
		
		
		
		
		int numOfStudents = 0;
		int[] scores;
		
		Scanner in = new Scanner(System.in);
		System.out.println("학생 수를 입력하시오.");
		numOfStudents = in.nextInt();
		scores = new int[numOfStudents]; // 학생 수 만큼 만듦
		
		System.out.println(numOfStudents + "명의 점수를 입력하시오.");
		
		for(int i = 0 ; i < numOfStudents ; i++) {
			scores[i] = in.nextInt();
		}
		
		System.out.println(numOfStudents + "명의 학생 성적은 다음과 같다.");
		for(int i : scores) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i = 0 ; i < numOfStudents; i++) {
			if(scores[i] >= 90) {
				System.out.println((i+1) + "의 등급은 A 입니다.");
			}else if (scores[i] >= 80) {
				System.out.println((i+1) + "의 등급은 B 입니다.");
			}else if (scores[i] >= 70) {
				System.out.println((i+1) + "의 등급은 C 입니다.");
			}else if (scores[i] >= 60) {
				System.out.println((i+1) + "의 등급은 D 입니다.");
			}else 
				System.out.println((i+1) + "의 등급은 F 입니다.");
		}
		
		

	}

} // 198 - 2번
