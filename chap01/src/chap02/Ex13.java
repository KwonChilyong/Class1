package chap02;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int r, h;
		double area;
		
		System.out.print("원기둥의 밑면 반지름은? ");
		r = in.nextInt();
		
		System.out.print("원기둥의 높이는? ");
		h = in.nextInt();
		
		area = r * r * h * 3.14;
		
		System.out.println("원기둥의 부피는 : " + area);
		
		
		

	}

}
