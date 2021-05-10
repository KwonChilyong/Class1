package chap09;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerEx01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String data;
		
		int no;
		String name;
		int kor, eng, mat, tot;
		double avg;
		
		int[][] score = new int[5][6];
		String[] irum = new String[5];
		double[] mean = new double[5];
		
		System.out.println("번호,이름,국어,영어,수학 점수를 입력(콤마로 구분 5명)");
		
		StringTokenizer st = new StringTokenizer("");
		
		for(int i = 0 ; i < 5 ; i++) {
			data = in.nextLine();
			st = new StringTokenizer(data, ",");
			while(st.hasMoreTokens()) {
				no = Integer.parseInt(st.nextToken()); // Integer.parseInt (문자열)을 정수형으로 바꿔주는 
				name = st.nextToken();
				kor = Integer.parseInt(st.nextToken()); // 인티저
				eng = Integer.parseInt(st.nextToken());
				mat = Integer.parseInt(st.nextToken());
				
				score[i][0] = no;
				score[i][1] = kor;
				score[i][2] = eng;
				score[i][3] = mat;
				score[i][4] = (kor+eng+mat);
				irum[i] = name;
				mean[i] = score[i][4] / 3.0;
			}
			
		}	
		for(int i = 0; i < 5; i++) {
			score[i][5] = 1;
			for(int j = 0; j < 5 ; j++) {
				if(score[i][4] < score[j][4]) {
					score[i][5]++;
				}
			}
		}
		for(int i = 0; i < 5; i++) {
			System.out.printf("%4d",score[i][0]);
			System.out.printf("%5s",irum[i]);
			System.out.printf("%4d",score[i][1]);
			System.out.printf("%4d",score[i][2]);
			System.out.printf("%4d",score[i][3]);
			System.out.printf("%4d",score[i][4]);
			System.out.printf("%.1f",mean[i]);
			System.out.printf("%4d",score[i][5]);
			
			System.out.println();
		}
		
		
		

	}
	private static int valueOfInt(String nextToken) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
