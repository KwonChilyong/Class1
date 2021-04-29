package chap05;

import java.util.Scanner;

public class p203Ex4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String url;

		do {
			System.out.println("URL을 입력하세요 : ");
			url = in.next();

			if (url.equals("bye")) {
				break;
			}
			if (url.endsWith("com")) {
				System.out.println(url + "은 'com'으로 끝납니다." + url);
			}
			if (url.contains("java")) {
				System.out.println(url + "은 'java'를 포함합니다." + url);
			}
		} while (true);

	}

}
