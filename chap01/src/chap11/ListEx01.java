package chap11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx01 {

	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("사슴");
		list.add("고양이");
		list.add("강아지");
		list.add("호랑이");
		
		
		System.out.println(list);
		System.out.println(list.get(3));
		System.out.println(list.contains("고양이"));
		System.out.println(list.remove(1)); //뭐가 지워지는지 알려주고 지워줌 (반환)
		System.out.println(list); // remove 후 고양이 사라짐
		System.out.println(list.subList(0, 1));
		System.out.println(list);
		list.add(1,"망아지");
		System.out.println(list);
		list.add("강아지");
		System.out.println(list); // 중복가능
		
		String[] str = {"홍길동","개똥이","이쁜이","영희","철수"};
		List<String> list1 = Arrays.asList(str);
//		List는 제네릭 타입이기에 <> 정해주자
		System.out.println(list1.get(2));
		System.out.println(list1);
		
		list1.set(3, "영호"); // 영희가 영호로 바뀜
		System.out.println(list1);
		
		for(String s : list1) {
			System.out.println(s);
		}
//		list1.sort(null); // null 로해도 오름차순 정렬
//		System.out.println(list1); 
		list1.sort((x,y)-> x.length() - y.length()); //람다식 표현
		System.out.println(list1); // 문자열의 길이를 가지고 정렬
//		list1.add("미숙이"); 오류남.. 어레이를 리스트로 바꾼경우는 add 안됨
		
		String[] str1 = list1.toArray(new String[list1.size()]);
		
		System.out.println(str1[2]);
	}

}
