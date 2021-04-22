package chap02;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x, y, z;
		System.out.print("전공 이수 학점 : ");
		x = in.nextInt();
		System.out.print("교양 이수 학점 : ");
		y = in.nextInt();
		System.out.print("일반 이수 학점 : ");
		z = in.nextInt();
		
		System.out.println
		((x+y+z >= 140 && x >=70 &&((y >= 30 && z >= 30)
		  || (y+z) >= 80)) ? "졸업 가능" : "졸업 불가능");
		
		String r = (x+y+z >= 140 && x >=70 &&((y >= 30 && z >= 30)
				  || (y+z) >= 80)) ? "졸업 가능" : "졸업 불가능";
		
		if((x+y+z >= 140 && x >=70 &&((y >= 30 && z >= 30)
		  || (y+z) >= 80)))
			System.out.println("졸업 가능");
		else
			System.out.println("졸업 가능");
	}

}
