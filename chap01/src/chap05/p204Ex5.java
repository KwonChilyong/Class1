package chap05;

import java.util.Scanner;

public class p204Ex5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] hi = new int[10];
		int temp;
		
		                                     
		System.out.println("���ڸ� 10�� �Է��ϼ���. : ");
		for(int i = 0 ; i < 10 ; i++) {
			temp = in.nextInt();
			if(temp >= 0) // ���� ����
			hi[temp/10]++;
			
		}
		
		for(int i = 0 ; i < 10 ; i++) {
			System.out.print((i*10) + "~" + ((i*10)+9) + " : ");
			for(int j = 0 ; j < hi[i] ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
