package chap11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Bingo {

	public static void main(String[] args) {
		Set<String> set = new HashSet();
		int[][] board = new int[5][5];
		for(int i = 0; set.size() < 25 ; i++) {
			set.add((int)(Math.random()*50) +1 +""); // + "" ����� �������� ���ڰ� ����.. ��¡
		}
		System.out.println("set�� ��ü ��ü�� ���");
		System.out.println(set);
		
		System.out.println("set�� ��ü for������ ���");
		for(String s : set) { // ��� ������ Set<String> ��� <> �������
			System.out.print(s + ", ");
		}
		System.out.println();
		System.out.println("set�� ��ü iterator�� ���");
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + ", ");
		}
		
		
////     set ����� Iterator ��� ��������
//		Iterator it = set.iterator();
//		for(int i = 0; i<board.length; i++) {
//			for(int j = 0; j<board[i].length; j++) {
//				board[i][j] = Integer.parseInt((String)it.next());
////				parseInt�� ���ڿ��� �������·� �ٲٴ°ǵ� ����ȯ�� �ٷ� �ȵǼ� (String)�� �ؼ� ���ڿ��� �ٽ� �ٲٰ� pareInt ���ش�
//				System.out.printf("%3d",board[i][j]);
//			}
//			System.out.println();
//		}
		
		
	}

}
