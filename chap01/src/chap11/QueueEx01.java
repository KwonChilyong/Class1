package chap11;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx01 {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList();
		
		System.out.println(q.poll()); //������� null�� ���
		q.offer("���");
		q.offer("�ٳ���");
		q.offer("������");
		
		System.out.println(q);
		
//		System.out.println(q.poll()); // ��ó�� �尣����� ����
//		System.out.println(q.poll());
//		System.out.println(q.poll());
//		System.out.println(q.poll());
		
		System.out.println(q.peek()); //��ó�� �尣�� ������ ã�°�
		System.out.println(q);
		q.remove(); // ��ó�� �尣�� ����
		System.out.println(q);
		
		
		
		

	}

}
