package chap09;

import java.util.Arrays;
import java.util.Collections;

public class ArraysEx01 {
			
		public static void print(Object[] s) {
//		for(int i = 0 ; i < s.length ; i++) {
//			System.out.print(s[i] + " ");
//		}
		for(Object str : s) { // �Ȱ��� ���
			System.out.print(str + " "); 
		} System.out.println();
	}
	public static void main(String[] args) {
		char[] a1 = {'J' , 'a', 'v', 'a'};
		char[] a2 = Arrays.copyOf(a1, a1.length);
		
		System.out.println(a2);
		
		String[] sa = {"����ũ", "����", "����", "�ٳ���"};
		print(sa);
		
		Arrays.sort(sa);
		System.out.println("��������");
		print(sa);
		System.out.println("��������");
		Arrays.sort(sa,(Collections.reverseOrder()));
		print(sa);
		
		String[] arr = new String[10];
//     ------------------		
		arr[0] = "abc";
		arr[1] = "abc";
		
		
		arr[9] = "abc";
		print(arr);
//	   ------------------
		for(int i = 0 ; i < 10 ; i++) {
			arr[i] = "abc";
		}
		print(arr);
//	   -------------------
		Arrays.fill(arr,"abc");
		print(arr);
//		�迭�� ä��� �Ȱ��� ����� .. Arrays.fill �� ���ϱ��ϳ� 
		
		
		
		
//		System.out.println(Arrays.binarySearch(sa, "����"));
//		
//		Arrays.fill(sa, 2, 4, "��Ÿ");
//		print(sa);
		

	}

}
