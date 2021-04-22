package chap05;

import java.util.Scanner;

public class MabangjinEx01 {

	public static void main(String[] args) {
		// 홀수 마방진
		Scanner in = new Scanner(System.in);
		System.out.println("몇 마방진을 만들까요?");
		int ma = in.nextInt();
		int[][] mabang = new int[ma][ma];
		int count = 1;
		int row, col;
		row = 0;
		col = ma / 2;
		mabang[row][col] = 1;
		for (int i = 1; i < ma * ma; i++) {
			row--;
			col++;
			count++;
			if (row < 0 && col == ma) {
				row += 2;
				col--;
			} else if (row < 0) {
				row = ma - 1;
			} else if(col == ma) {
				col = 0;
			} else if(mabang[row][col] != 0) {
				row += 2;
				col--;
			}
			mabang[row][col] = count;
		}
		for(int i = 0; i < ma; i++) {
			for(int j = 0; j < ma; j++) {
				System.out.printf("%3d",mabang[i][j]);
			}
			System.out.println();
		}
	}

}





