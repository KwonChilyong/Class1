package chap11;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListEx01 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList();
		LinkedList<Integer> ll = new LinkedList();
		
		long start = System.nanoTime();
		for(int i=0 ; i < 100000 ; i++) {
			al.add(0,i);
			
		}
		long end = System.nanoTime();
		long duration = end - start;
		System.out.println("ArrayList add()�� ó���� �ð�: " + duration);
		
		start = System.nanoTime();
		for(int i=0 ; i < 100000 ; i++) {
			ll.add(0,i);
			
		}
		end = System.nanoTime();
		duration = end - start;
		System.out.println("LinkedList add()�� ó���� �ð�: " + duration);

		
//		-----------------------
		
		start = System.nanoTime();
		for(int i=0 ; i < 100000 ; i++) {
			al.get(i);
			
		}
		end = System.nanoTime();
		duration = end - start;
		System.out.println("ArrayList get()�� ó���� �ð�: " + duration);
		
		start = System.nanoTime();
		for(int i=0 ; i < 100000 ; i++) {
			ll.get(i);
			
		}
		end = System.nanoTime();
		duration = end - start;
		System.out.println("LinkedList get()�� ó���� �ð�: " + duration);

//		add �� Linkedlist �� ������ get�� arraylist �� ������
		// arraylist �� �ַξ���
	}

}
