package chap09;

import java.util.Arrays;
import java.util.Collections;

public class ArraysEx01 {
			
		public static void print(Object[] s) {
//		for(int i = 0 ; i < s.length ; i++) {
//			System.out.print(s[i] + " ");
//		}
		for(Object str : s) { // 똑같은 방법
			System.out.print(str + " "); 
		} System.out.println();
	}
	public static void main(String[] args) {
		char[] a1 = {'J' , 'a', 'v', 'a'};
		char[] a2 = Arrays.copyOf(a1, a1.length);
		
		System.out.println(a2);
		
		String[] sa = {"케이크", "애플", "도넛", "바나나"};
		print(sa);
		
		Arrays.sort(sa);
		System.out.println("오름차순");
		print(sa);
		System.out.println("내림차순");
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
//		배열을 채우는 똑같은 방법들 .. Arrays.fill 이 편하긴하네 
		
		
		
		
//		System.out.println(Arrays.binarySearch(sa, "애플"));
//		
//		Arrays.fill(sa, 2, 4, "기타");
//		print(sa);
		

	}

}
