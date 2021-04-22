package chap02;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int hour, minute, second;
		System.out.print("초 단위 정수를 입력하세요 : ");
		second = in.nextInt();
		// 초를 3600으로 나눈 몫
		hour = second / 3600;
		
				// 초를 3600으로 나눈 나머지를 60으로 나눈 몫
		minute = second % 3600 / 60;
		
		// 초를 3600으로 나눈 나머지를 60으로 나눈 나머지
		second = second % 3600 % 60;      
        System.out.println(hour + "시 " + minute + "분 " 
		                    + second + "초");
	}

}
