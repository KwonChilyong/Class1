package chap11;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx01 {

	public static void main(String[] args) {
		Set set = new TreeSet(); //TreeSet �� �ڵ����ĵ�, �ߺ��� �ȵ�, hashset���� �˻��� ���� ã��������
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
		
		System.out.println(set);  // �������� �־ treeset�� �ڵ����� hashset�� �������� ��
		System.out.println(set1);
		// hashset�� �ַξ��� 
	}

}
