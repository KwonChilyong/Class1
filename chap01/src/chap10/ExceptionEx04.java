package chap10;

//import java.util.Scanner;
//
//public class ExceptionEx04 {
//
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		
//		System.out.println("숫자를 입력하세요.");
//		
//		try {
//		square(in.nextLine());
//		}catch(Exception e) {
//			System.out.println("입력이 잘못되었습니다.");
//		}
//	}
//	public static void square(String s) throws Exception{ //이 메소드에서 try catch 쓸수도 있고 
////											throws Exception 으로 square 있는 main 쪽으로 보내 main 쪽에서 try catch 해줄수도 있다. 
////		try {
//		int n = Integer.parseInt(s);
//		System.out.println(n*n);
////		}catch(Exception e) { //원래 NumberOf~~로 해야하는데 그냥 귀찮으면 바로 Exception 주로 쓰기도함 
////			System.out.println("입력이 잘못되었습니다.");
////		}
//	}
//}
//-------------------------------------------------------------------------------------

import java.util.Scanner;

public class ExceptionEx04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		
		try {
		square(in.nextLine());
		}catch(Exception e) {
//			e.printStackTrace();
			System.out.println("입력이 잘못되었습니다.");
			System.out.println(e.getMessage()); // 에러발생시 실제 입력한 값을 보여줌 
		}
	}
	public static void square(String s) {
//		try {
		int n = Integer.parseInt(s);
		System.out.println(n*n);
//		}catch(Exception e) {  
//			System.out.println("입력이 잘못되었습니다.");
//		}
	}
}
