package chap11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx01 {

	static HashMap phoneBook = new HashMap(); // phoneBook이라는 이름의 Map을 만듦
	
	public static void main(String[] args) {
//		Key는 중복이 안되는데 Key의 Value로 또다른 map을 가지게 만들면 된다.
		addPhoneNo("친구","이자바","010-1111-1111");
		addPhoneNo("친구","김자바","010-2222-2222");
		addPhoneNo("친구","오자바","010-3333-3333");
		addPhoneNo("직장","김대리","010-4444-4444");
		addPhoneNo("직장","박과장","010-5555-5555");
		addPhoneNo("가족","아버지","010-7777-7777");
		addPhoneNo("가족","어머니","010-8888-8888");
		addPhoneNo("친구","황자바","010-6666-6666");
		addPhoneNo("친구","류현진","010-9999-9999");
		addPhoneNo("회사","이부장","010-1234-1234");
		addPhoneNo("친구","김하성","010-1177-7711");
		addPhoneNo("친구","김광현","010-1234-5678");
		addPhoneNo("가족","누나","010-7788-8877");
		addPhoneNo("회사","권사원","010-7979-4242");
		addPhoneNo("세탁","010-9955-4758");
		addPhoneNo("체육관","010-0245-9652"); 
		printlist();
	}
	
	static void addPhoneNo(String groupName, String name, String tel) {
		addGroup(groupName);
		HashMap group = (HashMap)phoneBook.get(groupName); // 친구라는 이름의 값을 불러옴, HashMap으로 형변환
		group.put(tel, name);
	}
	static void addPhoneNo(String groupName, String tel) {
		addPhoneNo("기타",groupName,tel); // 기타로 묶어서
	}
	static void addGroup(String groupName) {
		if(!phoneBook.containsKey(groupName)) {
			phoneBook.put(groupName, new HashMap()); // value 값에 map()을 만듦.
		}
	}
//	---------------------------------------출력단(어려움 형변환이 많음)------------------
	static void printlist() {
		Set set = phoneBook.entrySet(); //entryset = map타입을 set타입으로 바꿔라 (map을 출력할려면 set으로 바꿔야하니)
		Iterator it = set.iterator();
		
		while(it.hasNext()) { // it 에서 읽어낼수있는게 있을때까지 
			Map.Entry e = (Map.Entry)it.next(); // Map.Entry 는 key,value 값을 가진 형태
			Set subset = ((HashMap)e.getValue()).entrySet(); // e.getValue 가 Map 이니 hashmap으로 형변환후 entryset해줌

			Iterator subit = subset.iterator();
			
			System.out.println(" * " + e.getKey() + "[ " + subset.size() + "]");
			
			while(subit.hasNext()) {
				Map.Entry subE = (Map.Entry)subit.next();
				String telNo = (String)subE.getKey();
				String name = (String)subE.getValue();
				System.out.println(name + " : " + telNo);
			}
			System.out.println();
		}
	}

}
