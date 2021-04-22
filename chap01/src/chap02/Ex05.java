package chap02;

public class Ex05 {

	public static void main(String[] args) {
		int no, kor, eng, mat, tot;
		double avg;
		String name;
		no = 1;
		name = "홍길동";
		kor = 80;
		eng = 90;
		mat = 98;
		tot = kor + eng + mat;
		avg = tot / 3.0;
		System.out.println("----------------------------");
		System.out.println("번호 이름 국어 영어 수학 총점   평균");
		System.out.println("----------------------------");
		System.out.printf("%2d%4s%3d%4d%3d%4d%7.2f\n",no,name,kor,eng,mat,tot,avg);
	}

}
