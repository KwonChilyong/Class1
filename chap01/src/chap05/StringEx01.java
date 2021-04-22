package chap05;

import java.util.Scanner;

public class StringEx01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i;
		String str = new String("ȫ�浿");
		
		String str1 = new String();
		str1 = "ȫ�浿";
		
		String str2 = "ȫ�浿";
		
		String str3;
		str3 = "ȫ�浿";
		
		System.out.println("str == str1\t" + str.equals(str1));
		System.out.println("str1 == str2\t" + (str1 == str2));
		System.out.println("str2 == str3\t" + (str2 == str3));
		

	}

}
