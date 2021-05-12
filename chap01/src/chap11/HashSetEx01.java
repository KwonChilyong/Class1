package chap11;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSetEx01 {

	public static void main(String[] args) {
		Set set = new HashSet(); //Set �� �������̽��� new Set �Ҽ� ��� �ڽ��� HashSet���� �ϴ°���
		for(int i = 0; set.size() < 6; i++) {
			int rnd = (int)((Math.random()) * 45) +1;
			set.add(rnd);
		}
		System.out.println(set); // set�̴� �ߺ��� �ȵ�
		
//		set.sort();  set�� sort �� �ȵ� ���� sort �ҷ��� linkdlist�� �ٲ㼭 sort �������.
		List list = new LinkedList(set);
		System.out.println(list);
		
		list.sort(null);
		System.out.println(list);
		
		//set�� ���� ��� ���׹����� set�� list �Դٰ��� ����.
		Set set1 = new HashSet(list);
		System.out.println(set1);
		
	}

}
