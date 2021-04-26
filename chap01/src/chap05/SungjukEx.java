package chap05;

import java.util.Scanner;

import chap04.Student;

public class SungjukEx {

	public static void main(String[] args) {
//		Student st = new Student();     // 예전에 만든 거 사용가능. ctr+shift+o로 불러오기
		
		Scanner in = new Scanner(System.in);
		Student[] st = new Student[5];
		
		for(int i = 0 ; i<5 ; i++) {
			st[i] = new Student();
		}                              //이걸 꼭 써줘야함 객체를 배열로 활용할때 써줘야함
		
	
		for(int i=0 ; i < 5; i++) {
			System.out.println("번호, 이름, 국어, 영어, 수학 점수를 입력하세요.");
			st[i].setNo(in.nextInt()); 
			st[i].setName(in.next());  
			st[i].setKor(in.nextInt());
			st[i].setEng(in.nextInt());
			st[i].setMat(in.nextInt());
			int tot = st[i].getKor() + st[i].getEng() + st[i].getMat();
			st[i].setTot(tot); // setTot 에 tot 를 넣는다.
			st[i].setAvg(tot / 3.0);
		} 
		System.out.println("----------------------------------");
		System.out.println("번호   이름  국어 영어 수학 총점  평균");
		System.out.println("----------------------------------");
		for(int i = 0 ; i < 5 ; i++) {
			System.out.printf("%2d%7s%5d%4d%4d%4d%7.2f\n", st[i].getNo(),
					st[i].getName(), st[i].getKor(), st[i].getEng(), st[i].getMat()
					, st[i].getTot(), st[i].getAvg());
		}
		

	}

}
