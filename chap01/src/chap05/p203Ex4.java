package chap05;

import java.util.Scanner;

public class p203Ex4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String url;

		do {
			System.out.println("URL�� �Է��ϼ��� : ");
			url = in.next();

			if (url.equals("bye")) {
				break;
			}
			if (url.endsWith("com")) {
				System.out.println(url + "�� 'com'���� �����ϴ�." + url);
			}
			if (url.contains("java")) {
				System.out.println(url + "�� 'java'�� �����մϴ�." + url);
			}
		} while (true);

	}

}
