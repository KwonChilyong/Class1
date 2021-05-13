package chap11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortDemo {

	public static void main(String[] args) {
		String[] s = {"나는","조국","대한민국을","사랑합니다"};
		List<String> list = Arrays.asList(s);
		
		System.out.println(list); // list는 순서가 있으니까 쓴 그대로 나옴.
		
		Collections.sort(list);
		System.out.println(list); // ㄴ,ㄷ,ㅅ,ㅈ 순으로 정렬되서 출력됨.
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);  // 역순으로 정렬.
		
		Collections.reverse(list);
		System.out.println(list); // 그냥 reverse 로 바로해도 역순정렬 된다.
		
		
		
		

	}

}
