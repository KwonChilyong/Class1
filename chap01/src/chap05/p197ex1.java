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
//		System.out.println("�л� ���� �Է��Ͻÿ�.");
//		numOfStudents = in.nextInt();
//		scores = new int[numOfStudents]; // �л� �� ��ŭ ����
//		
//		System.out.println(numOfStudents + "���� ������ �Է��Ͻÿ�.");
//		
//		for(int i = 0 ; i < numOfStudents ; i++) {
//			scores[i] = in.nextInt();
//		}
//		
//		System.out.println(numOfStudents + "���� �л� ������ ������ ����.");
//		for(int i = 0 ; i < numOfStudents ; i++) {
//			System.out.println(scores[i] + " ");
//		}
//		
//		
//		
//
//	}
//
//}   197 - 1��
package chap05;

import java.util.Scanner;

public class p197ex1 {

	public static void main(String[] args) {
		
//		int[][] a = {{0},{1,2},{3,4,5}};
//		
////		int[][] a1;
////		
////		a1 = new int[3][];  // ���� ���� ����
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
////		}   43~54 �������  // int[][] a = {{0},{1,2},{3,4,5}}; �� ����
//		for(int i = 0; i < 3 ; i++) {
//			for(int j = 0; j <= i ; j++) {
//				System.out.printf("%2d",a1[i][j]);
//			}
//			System.out.println();
//		}
//		p201 9�� ���� 
		
		
		
		
		
		
		
		int numOfStudents = 0;
		int[] scores;
		
		Scanner in = new Scanner(System.in);
		System.out.println("�л� ���� �Է��Ͻÿ�.");
		numOfStudents = in.nextInt();
		scores = new int[numOfStudents]; // �л� �� ��ŭ ����
		
		System.out.println(numOfStudents + "���� ������ �Է��Ͻÿ�.");
		
		for(int i = 0 ; i < numOfStudents ; i++) {
			scores[i] = in.nextInt();
		}
		
		System.out.println(numOfStudents + "���� �л� ������ ������ ����.");
		for(int i : scores) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i = 0 ; i < numOfStudents; i++) {
			if(scores[i] >= 90) {
				System.out.println((i+1) + "�� ����� A �Դϴ�.");
			}else if (scores[i] >= 80) {
				System.out.println((i+1) + "�� ����� B �Դϴ�.");
			}else if (scores[i] >= 70) {
				System.out.println((i+1) + "�� ����� C �Դϴ�.");
			}else if (scores[i] >= 60) {
				System.out.println((i+1) + "�� ����� D �Դϴ�.");
			}else 
				System.out.println((i+1) + "�� ����� F �Դϴ�.");
		}
		
		

	}

} // 198 - 2��
