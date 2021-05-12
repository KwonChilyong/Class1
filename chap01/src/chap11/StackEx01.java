package chap11;

import java.util.Stack;

public class StackEx01 {

	public static void main(String[] args) {
		Stack<String> s1 = new Stack();
		
		s1.push("사과"); //Stack 은 add가 아니라 push다.
		s1.push("배");
		s1.push("바나나");
		s1.push("오렌지");
		
		System.out.println(s1);
		
		System.out.println(s1.peek()); // 스택 최상위 원소를 제거하지 않고 엿보기.(스택 최상위 = 마지막에 들어간놈)
		System.out.println(s1);
		
		System.out.println(s1.pop()); // 스택 최상위 보여주고 스택에서 제거
		System.out.println(s1);
		
		System.out.println(s1.pop()); 
		System.out.println(s1);
		System.out.println(s1.pop()); 
		System.out.println(s1);
		System.out.println(s1.pop()); 
		System.out.println(s1);
		
	}

}
