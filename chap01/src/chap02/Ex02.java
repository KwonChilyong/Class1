package chap02;

public class Ex02 {

	public static void main(String[] args) {
		int weight;
		weight = 50;  // int weight = 50;
		
		double x, y, z;
		x = 10.5;
		y = 20.5;
		z = 30.5;  // double x=10.5, y=20.5, z=30.5;
		
		int i , j = 10;
		i = 20;
		System.out.println(i);
		System.out.println(j);
		
		final double PI = 3.1415926535;
//		PI = 3.15;
		
		// 타입 변환(자동)
		double avg;
		int kor, eng, mat;
		kor = 85;
		eng = 93;
		mat = 76;
		avg = (kor + eng + mat) / 3.0;
		System.out.println((kor + eng + mat) / 3);
		System.out.println("avg : " + avg);
		
		// 강제 변환
		
		int first;
		long second = 123;
		
		first = (int)second;
		System.out.println(first);
		
		double dd = 456.45;
		
		first = (int)dd;
		System.out.println(first);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
