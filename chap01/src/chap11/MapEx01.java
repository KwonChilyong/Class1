package chap11;

import java.util.HashMap;
import java.util.Map;

public class MapEx01 {

	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap();
//		key�� String�̰� value�� Integer Ÿ���� MapŸ��
		
		m.put("���", 5);  // hashmap�� ��ü �߰�
		m.put("�ٳ���", 3);
		m.put("����", 10);
		m.put("����", 1);
		
		System.out.println(m.size() + "������ ������ �ֽ��ϴ�.");
		System.out.println(m);
		System.out.println(m.get("����")); // Ű�� ���� ���� �θ��� get
		
		for(String key : m.keySet())
			System.out.println(key + "�� " + m.get(key) + "�� �ֽ��ϴ�." );
		
		m.put("�ٳ���", 50);
		System.out.println(m); // �ٳ����� 3������ 50���� �ٲ�
//		�ߺ��� Ű �߰��ϸ� value ���� ������� ���� (�߰��Ǵ°� �ƴ�)
		
		m.put(new String("�ٳ���"), 30);
		m.put(new String("�ٳ���"), 40);
		System.out.println(m);
		
	}

}
