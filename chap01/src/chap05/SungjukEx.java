package chap05;

import java.util.Scanner;

import chap04.Student;

public class SungjukEx {

	public static void main(String[] args) {
//		Student st = new Student();     // ������ ���� �� ��밡��. ctr+shift+o�� �ҷ�����
		
		Scanner in = new Scanner(System.in);
		Student[] st = new Student[5];
		
		for(int i = 0 ; i<5 ; i++) {
			st[i] = new Student();
		}                              //�̰� �� ������� ��ü�� �迭�� Ȱ���Ҷ� �������
		
	
		for(int i=0 ; i < 5; i++) {
			System.out.println("��ȣ, �̸�, ����, ����, ���� ������ �Է��ϼ���.");
			st[i].setNo(in.nextInt()); 
			st[i].setName(in.next());  
			st[i].setKor(in.nextInt());
			st[i].setEng(in.nextInt());
			st[i].setMat(in.nextInt());
			int tot = st[i].getKor() + st[i].getEng() + st[i].getMat();
			st[i].setTot(tot); // setTot �� tot �� �ִ´�.
			st[i].setAvg(tot / 3.0);
		} 
		System.out.println("----------------------------------");
		System.out.println("��ȣ   �̸�  ���� ���� ���� ����  ���");
		System.out.println("----------------------------------");
		for(int i = 0 ; i < 5 ; i++) {
			System.out.printf("%2d%7s%5d%4d%4d%4d%7.2f\n", st[i].getNo(),
					st[i].getName(), st[i].getKor(), st[i].getEng(), st[i].getMat()
					, st[i].getTot(), st[i].getAvg());
		}
		

	}

}
