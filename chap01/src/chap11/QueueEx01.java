package chap11;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx01 {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList();
		
		System.out.println(q.poll()); //비었으면 null로 출력
		q.offer("사과");
		q.offer("바나나");
		q.offer("오렌지");
		
		System.out.println(q);
		
//		System.out.println(q.poll()); // 맨처음 드간놈부터 제거
//		System.out.println(q.poll());
//		System.out.println(q.poll());
//		System.out.println(q.poll());
		
		System.out.println(q.peek()); //맨처음 드간놈 누군지 찾는거
		System.out.println(q);
		q.remove(); // 맨처음 드간놈 삭제
		System.out.println(q);
		
		
		
		

	}

}
