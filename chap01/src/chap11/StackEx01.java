package chap11;

import java.util.Stack;

public class StackEx01 {

	public static void main(String[] args) {
		Stack<String> s1 = new Stack();
		
		s1.push("���"); //Stack �� add�� �ƴ϶� push��.
		s1.push("��");
		s1.push("�ٳ���");
		s1.push("������");
		
		System.out.println(s1);
		
		System.out.println(s1.peek()); // ���� �ֻ��� ���Ҹ� �������� �ʰ� ������.(���� �ֻ��� = �������� ����)
		System.out.println(s1);
		
		System.out.println(s1.pop()); // ���� �ֻ��� �����ְ� ���ÿ��� ����
		System.out.println(s1);
		
		System.out.println(s1.pop()); 
		System.out.println(s1);
		System.out.println(s1.pop()); 
		System.out.println(s1);
		System.out.println(s1.pop()); 
		System.out.println(s1);
		
	}

}
