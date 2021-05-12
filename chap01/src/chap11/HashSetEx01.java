package chap11;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSetEx01 {

	public static void main(String[] args) {
		Set set = new HashSet(); //Set 은 인터페이스라 new Set 할수 없어서 자식인 HashSet으로 하는거임
		for(int i = 0; set.size() < 6; i++) {
			int rnd = (int)((Math.random()) * 45) +1;
			set.add(rnd);
		}
		System.out.println(set); // set이니 중복은 안됨
		
//		set.sort();  set은 sort 가 안됨 따라서 sort 할려면 linkdlist로 바꿔서 sort 해줘야함.
		List list = new LinkedList(set);
		System.out.println(list);
		
		list.sort(null);
		System.out.println(list);
		
		//set은 순서 없어서 뒤죽박죽임 set과 list 왔다갔다 가능.
		Set set1 = new HashSet(list);
		System.out.println(set1);
		
	}

}
