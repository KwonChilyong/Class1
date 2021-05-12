package chap11;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx01 {

	public static void main(String[] args) {
		Set set = new TreeSet(); //TreeSet 은 자동정렬됨, 중복은 안됨, hashset보다 검색시 빨리 찾을수있음
		Set set1 = new HashSet();
		
		set.add(23);
		set1.add(23);
		set.add(8);
		set1.add(8);
		set.add(45);
		set1.add(45);
		set.add(36);
		set1.add(36);
		set.add(25);
		set1.add(25);
		set.add(16);
		set1.add(16);
		set.add(7);
		set1.add(7);
		
		System.out.println(set);  // 같은값을 넣어도 treeset은 자동정렬 hashset은 순서없이 들어감
		System.out.println(set1);
		// hashset이 주로쓰임 
	}

}
