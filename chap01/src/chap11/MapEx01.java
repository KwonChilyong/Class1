package chap11;

import java.util.HashMap;
import java.util.Map;

public class MapEx01 {

	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap();
//		key가 String이고 value가 Integer 타입인 Map타입
		
		m.put("사과", 5);  // hashmap에 객체 추가
		m.put("바나나", 3);
		m.put("포도", 10);
		m.put("딸기", 1);
		
		System.out.println(m.size() + "종류의 과일이 있습니다.");
		System.out.println(m);
		System.out.println(m.get("포도")); // 키에 대한 값을 부를때 get
		
		for(String key : m.keySet())
			System.out.println(key + "가 " + m.get(key) + "개 있습니다." );
		
		m.put("바나나", 50);
		System.out.println(m); // 바나나가 3개에서 50개로 바뀜
//		중복된 키 추가하면 value 값이 덮어씌워짐 ㅇㅇ (추가되는게 아님)
		
		m.put(new String("바나나"), 30);
		m.put(new String("바나나"), 40);
		System.out.println(m);
		
	}

}
