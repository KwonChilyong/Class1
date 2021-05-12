package chap11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Bingo {

	public static void main(String[] args) {
		Set<String> set = new HashSet();
		int[][] board = new int[5][5];
		for(int i = 0; set.size() < 25 ; i++) {
			set.add((int)(Math.random()*50) +1 +""); // + "" 해줘야 무작위로 숫자가 들어가네.. 왜징
		}
		System.out.println("set의 전체 객체로 출력");
		System.out.println(set);
		
		System.out.println("set의 전체 for문으로 출력");
		for(String s : set) { // 요고 쓸때는 Set<String> 요고 <> 해줘야함
			System.out.print(s + ", ");
		}
		System.out.println();
		System.out.println("set의 전체 iterator로 출력");
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + ", ");
		}
		
		
////     set 출력은 Iterator 라고 생각하자
//		Iterator it = set.iterator();
//		for(int i = 0; i<board.length; i++) {
//			for(int j = 0; j<board[i].length; j++) {
//				board[i][j] = Integer.parseInt((String)it.next());
////				parseInt는 문자열을 정수형태로 바꾸는건데 형변환이 바로 안되서 (String)을 해서 문자열로 다시 바꾸고 pareInt 해준다
//				System.out.printf("%3d",board[i][j]);
//			}
//			System.out.println();
//		}
		
		
	}

}
