package chap04;

import java.util.Scanner;

public class StudentScoreEx {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Student st = new Student();
		System.out.println("번호, 이름, 국어, 영어, 수학 점수를 입력하세요.");
		
		st.setNo(in.nextInt()); // Student 클래스에서 만든거에 입력한걸 넣어주는거
		st.setName(in.next());  // set 쓰는 이유는 private 되어있는거니까 쓰는거임
		st.setKor(in.nextInt());
		st.setEng(in.nextInt());
		st.setMat(in.nextInt());
		
		int tot = st.getKor() + st.getEng() + st.getMat();
		st.setTot(tot); // setTot 에 tot 를 넣는다.
		st.setAvg(tot / 3.0);
		st.stPrint();
		
		
		
	}

}
