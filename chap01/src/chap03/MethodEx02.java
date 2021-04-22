package chap03;

import java.util.Scanner;

public class MethodEx02 {

	public static void main(String[] args) {
		int ma;
		Scanner in = new Scanner(System.in);
		System.out.println("몇 마방진?");
		ma = in.nextInt();
		int mabang[][] = new int[ma][ma];
		mabangPan(mabang); //매소드 호출
		printMabang(mabang); //매소드 호출 

	}
	public static void printMabang(int[][] mabang) {
		for(int i = 0; i < mabang.length; i++) {
			for(int j = 0; j < mabang.length; j++) {
				System.out.printf("%3d",mabang[i][j]);
			}
			System.out.println();
		}
	}
	
public static void mabangPan(int[][] mabang) {
	int count = 1;
	int row, col;
	row = 0;
	col = mabang.length / 2;
	mabang[row][col] = 1;
	for (int i = 1; i < mabang.length * mabang.length; i++) {
		row--;
		col++;
		count++;
		if (row < 0 && col == mabang.length) {
			row += 2;
			col--;
		} else if (row < 0) {
			row = mabang.length - 1;
		} else if(col == mabang.length) {
			col = 0;
		} else if(mabang[row][col] != 0) {
			row += 2;
			col--;
		}
		mabang[row][col] = count;
	}
}
}






