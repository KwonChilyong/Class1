package chap04;

import java.util.Scanner;

public class StudentScoreEx {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Student st = new Student();
		System.out.println("��ȣ, �̸�, ����, ����, ���� ������ �Է��ϼ���.");
		
		st.setNo(in.nextInt()); // Student Ŭ�������� ����ſ� �Է��Ѱ� �־��ִ°�
		st.setName(in.next());  // set ���� ������ private �Ǿ��ִ°Ŵϱ� ���°���
		st.setKor(in.nextInt());
		st.setEng(in.nextInt());
		st.setMat(in.nextInt());
		
		int tot = st.getKor() + st.getEng() + st.getMat();
		st.setTot(tot); // setTot �� tot �� �ִ´�.
		st.setAvg(tot / 3.0);
		st.stPrint();
		
		
		
	}

}
