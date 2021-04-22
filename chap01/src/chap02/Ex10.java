package chap02;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		double w, h , area;
		Scanner in = new Scanner(System.in);
		System.out.print("직사각형의 가로 길이를 입력하세요 : ");
		w = in.nextDouble();
		System.out.print("직사각형의 세로 길이를 입력하세요 : ");
		h = in.nextDouble();
		area = w * h;
		System.out.println("직사각형의 넓이는 " + area + "입니다");
		double d1, d2, d3;
		d1 = 10.34;
		d2 = 4.78;
		d3 = d1 % d2;
		
		System.out.println(d3);
		
		int x = 1, y = 2;
		System.out.println(x++);
		System.out.println(++x + y--);
		System.out.println(++x / 3 + x * ++y);
	}

}
