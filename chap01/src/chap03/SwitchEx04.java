package chap03;

import java.util.Scanner;

public class SwitchEx04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("수식을 입력 하세요.");
		int num1 = in.nextInt();
		String opr = in.next();
		int num2 = in.nextInt();
		
		switch(opr) {
		case "+":
			System.out.println(num1 + " + " + num2 
					 + " = " + (num1 + num2));
			break;
		case "-":
			System.out.println(num1 + " - " + num2 
					 + " = " + (num1 - num2));
			break;	
		case "*":
			System.out.println(num1 + " * " + num2 
					 + " = " + (num1 * num2));
			break;	
		case "/":
			System.out.println(num1 + " / " + num2 
					 + " = " + (num1 / (double)num2));
			break;
			default:
				System.out.println("잘못된 수식입니다.");
		}
		
		
		
		
		

	}

}
