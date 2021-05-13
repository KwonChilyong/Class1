package chap11;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx01 {

	public static void main(String[] args) {
		String[] data = {"A","C","A","D","E","C","B","D","A","E","C","B","D","A","D"};
		TreeMap map = new TreeMap();
		
		for(int i = 0; i < data.length ; i++) {
			if(map.containsKey(data[i])) {
				map.put(data[i], (int)map.get(data[i]) +1);
			}else {
				map.put(data[i], 1);
			}
		}
		System.out.println(map);
		
//		숫자를 *로 표현해봄. Set 타입으로 만들고 Iterator
		
		Set set = map.entrySet();  // 둘다 import 해주는거 까먹지말고.
		Iterator it = set.iterator();
//		Iterator it = map.entrySet().iterator();  위 두줄을 이렇게 한줄로 표현해도 된다. (한줄로하면 set을 따로 안만들어도 된다)
		
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next(); //map 도 import 까먹지 말고.
			int value = (int)entry.getValue();
			System.out.print(entry.getKey()+" : ");
			for(int i = 0 ; i < value ; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
