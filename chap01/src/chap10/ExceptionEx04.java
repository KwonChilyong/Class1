package chap10;

//import java.util.Scanner;
//
//public class ExceptionEx04 {
//
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		
//		System.out.println("���ڸ� �Է��ϼ���.");
//		
//		try {
//		square(in.nextLine());
//		}catch(Exception e) {
//			System.out.println("�Է��� �߸��Ǿ����ϴ�.");
//		}
//	}
//	public static void square(String s) throws Exception{ //�� �޼ҵ忡�� try catch ������ �ְ� 
////											throws Exception ���� square �ִ� main ������ ���� main �ʿ��� try catch ���ټ��� �ִ�. 
////		try {
//		int n = Integer.parseInt(s);
//		System.out.println(n*n);
////		}catch(Exception e) { //���� NumberOf~~�� �ؾ��ϴµ� �׳� �������� �ٷ� Exception �ַ� ���⵵�� 
////			System.out.println("�Է��� �߸��Ǿ����ϴ�.");
////		}
//	}
//}
//-------------------------------------------------------------------------------------

import java.util.Scanner;

public class ExceptionEx04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���.");
		
		try {
		square(in.nextLine());
		}catch(Exception e) {
//			e.printStackTrace();
			System.out.println("�Է��� �߸��Ǿ����ϴ�.");
			System.out.println(e.getMessage()); // �����߻��� ���� �Է��� ���� ������ 
		}
	}
	public static void square(String s) {
//		try {
		int n = Integer.parseInt(s);
		System.out.println(n*n);
//		}catch(Exception e) {  
//			System.out.println("�Է��� �߸��Ǿ����ϴ�.");
//		}
	}
}
