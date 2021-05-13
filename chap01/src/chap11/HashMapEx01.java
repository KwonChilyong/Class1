package chap11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx01 {

	static HashMap phoneBook = new HashMap(); // phoneBook�̶�� �̸��� Map�� ����
	
	public static void main(String[] args) {
//		Key�� �ߺ��� �ȵǴµ� Key�� Value�� �Ǵٸ� map�� ������ ����� �ȴ�.
		addPhoneNo("ģ��","���ڹ�","010-1111-1111");
		addPhoneNo("ģ��","���ڹ�","010-2222-2222");
		addPhoneNo("ģ��","���ڹ�","010-3333-3333");
		addPhoneNo("����","��븮","010-4444-4444");
		addPhoneNo("����","�ڰ���","010-5555-5555");
		addPhoneNo("����","�ƹ���","010-7777-7777");
		addPhoneNo("����","��Ӵ�","010-8888-8888");
		addPhoneNo("ģ��","Ȳ�ڹ�","010-6666-6666");
		addPhoneNo("ģ��","������","010-9999-9999");
		addPhoneNo("ȸ��","�̺���","010-1234-1234");
		addPhoneNo("ģ��","���ϼ�","010-1177-7711");
		addPhoneNo("ģ��","�豤��","010-1234-5678");
		addPhoneNo("����","����","010-7788-8877");
		addPhoneNo("ȸ��","�ǻ��","010-7979-4242");
		addPhoneNo("��Ź","010-9955-4758");
		addPhoneNo("ü����","010-0245-9652"); 
		printlist();
	}
	
	static void addPhoneNo(String groupName, String name, String tel) {
		addGroup(groupName);
		HashMap group = (HashMap)phoneBook.get(groupName); // ģ����� �̸��� ���� �ҷ���, HashMap���� ����ȯ
		group.put(tel, name);
	}
	static void addPhoneNo(String groupName, String tel) {
		addPhoneNo("��Ÿ",groupName,tel); // ��Ÿ�� ���
	}
	static void addGroup(String groupName) {
		if(!phoneBook.containsKey(groupName)) {
			phoneBook.put(groupName, new HashMap()); // value ���� map()�� ����.
		}
	}
//	---------------------------------------��´�(����� ����ȯ�� ����)------------------
	static void printlist() {
		Set set = phoneBook.entrySet(); //entryset = mapŸ���� setŸ������ �ٲ�� (map�� ����ҷ��� set���� �ٲ���ϴ�)
		Iterator it = set.iterator();
		
		while(it.hasNext()) { // it ���� �о���ִ°� ���������� 
			Map.Entry e = (Map.Entry)it.next(); // Map.Entry �� key,value ���� ���� ����
			Set subset = ((HashMap)e.getValue()).entrySet(); // e.getValue �� Map �̴� hashmap���� ����ȯ�� entryset����

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
