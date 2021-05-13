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
		
//		���ڸ� *�� ǥ���غ�. Set Ÿ������ ����� Iterator
		
		Set set = map.entrySet();  // �Ѵ� import ���ִ°� ���������.
		Iterator it = set.iterator();
//		Iterator it = map.entrySet().iterator();  �� ������ �̷��� ���ٷ� ǥ���ص� �ȴ�. (���ٷ��ϸ� set�� ���� �ȸ��� �ȴ�)
		
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next(); //map �� import ����� ����.
			int value = (int)entry.getValue();
			System.out.print(entry.getKey()+" : ");
			for(int i = 0 ; i < value ; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
